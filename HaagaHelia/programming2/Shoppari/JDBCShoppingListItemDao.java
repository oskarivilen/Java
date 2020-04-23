package shoppari;

import java.util.List;

import shoppari.ShoppingListItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBCShoppingListItemDao toteuttaa rajapinnan, ja sisältää konkreettisen
 * SQL-logiikan
 */
public class JDBCShoppingListItemDao implements ShoppingListItemDao {

   
    private static final String JDBC_URL = "jdbc:sqlite:users:/Oskari/Documents/shoppingList.sqlite";
    
    private int nextId = 1;
    

    @Override
    public List<ShoppingListItem> getAllItems() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        List<ShoppingListItem> items = new ArrayList<>();

        try {
            
            connection = DriverManager.getConnection(JDBC_URL);

            // muodostetaan kysely "SELECT * FROM ShoppingListItem"
            statement = connection.prepareStatement("SELECT * FROM ShoppingListItem");

            // suoritetaan kysely
            results = statement.executeQuery();

            // tulostetaan kaikki tuloksena saadut rivit
            while (results.next()) {
                long id = results.getLong("id");
                String title = results.getString("title");
                ShoppingListItem newItem = new ShoppingListItem(id, title);

                items.add(newItem);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            close(connection, statement, results);
        }
        return items;
    }

    @Override
    public ShoppingListItem getItem(long id) {
    
    	return null;
        
    }

    @Override
    public boolean addItem(ShoppingListItem newItem) {
        // Suoritetaan insert-komento, jossa title-parametriksi asetetaan
        // `newItem.getTitle()`

        // Muista käyttää PreparedStatement-luokan setString-metodia!

        // voit myös asettaa generoidun id:n newItem-oliolle setId-metodilla, katso:
        // https://git.io/JfkVJ
    	
    	String SQL = "INSERT INTO shoppingList";

        boolean id = true;

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, newItem.getTitle());
           

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }

    @Override
    public boolean removeItem(ShoppingListItem item) {
    	  Connection connection = null;
    	  PreparedStatement statement = null;
          try
          {
              Class.forName("com.mysql.jdbc.Driver");
              connection = DriverManager.getConnection(JDBC_URL);
               
              statement = connection.prepareStatement("DELETE * FROM ShoppingListItem");
              
          } 
          catch (Exception e) {
              e.printStackTrace();
          }finally {
              try {   
            	  statement.close();
                  connection.close();
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
          return false;
      }  
    

    private void close(Connection connection, PreparedStatement statement, ResultSet results) {
        if (results != null) {
            try {
                results.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

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

    // Tietokannan sijainti voidaan asettaa myös ympäristömuuttujaan, katso:
    // https://git.io/JfkVk
    private static final String JDBC_URL = "jdbc:sqlite:C:\\sqlite\\shoppingList.sqlite";
    
    private int nextId = 1;
    List<ShoppingListItem> items = new ArrayList<>();

    @Override
    public List<ShoppingListItem> getAllItems() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

       

        try {
            // muodostetaan yhteys tietokantaan
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
    
    	 return items.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
        
    }

    @Override
    public boolean addItem(ShoppingListItem newItem) {
        // Suoritetaan insert-komento, jossa title-parametriksi asetetaan
        // `newItem.getTitle()`

        // Muista käyttää PreparedStatement-luokan setString-metodia!

        // voit myös asettaa generoidun id:n newItem-oliolle setId-metodilla, katso:
        // https://git.io/JfkVJ
    	
    	  newItem.setId(nextId++);
          return items.add(newItem);
    }

    @Override
    public boolean removeItem(ShoppingListItem item) {
    	 return items.remove(item);
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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

public class ProductManagerTest {
    Product product1 = new Product(1, "Product1", 40);
    Product product2 = new Product(2, "Product2", 60);
    Product product3 = new Product(3, "Product3", 20);

    Book book1 = new Book(11, "Book1", 1800, "Author1");
    Book book2 = new Book(12, "Book2", 1200, "Author2");
    Book book3 = new Book(13, "Book3", 1500, "Author3");
    Book book4 = new Book(14, "Book4", 1000, "Author4");
    Book book5 = new Book(15, "Book5", 500, "Author5");

    Smartphone smartphone1 = new Smartphone(21, "Smartphone1", 15000, "Manufacturer1");
    Smartphone smartphone2 = new Smartphone(22, "Smartphone2", 95000, "Manufacturer2");
    Smartphone smartphone3 = new Smartphone(23, "Smartphone3", 56000, "Manufacturer3");
    Smartphone smartphone4 = new Smartphone(24, "Smartphone4", 38000, "Manufacturer4");
    Smartphone smartphone5 = new Smartphone(25, "Smartphone5", 21000, "Manufacturer5");

    @Test
    public void searchProductByName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = new Product[]{product1};
        Product[] actual = manager.searchBy("Product1");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSmartphoneByName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);
        manager.add(smartphone5);

        Product[] expected = new Smartphone[]{smartphone3};
        Product[] actual = manager.searchBy("Smartphone3");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBookByName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = new Book[]{book4};
        Product[] actual = manager.searchBy("Book4");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchProductByPartOfName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = new Product[]{product2};
        Product[] actual = manager.searchBy("duct2");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSmartphoneByPartOfName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);
        manager.add(smartphone5);

        Product[] expected = new Smartphone[]{smartphone2};;
        Product[] actual = manager.searchBy("phone2");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBookByPartOfName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = new Book[]{book3};
        Product[] actual = manager.searchBy("ok3");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSeveralProductsByName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = new Product[]{product1, product2, product3};
        Product[] actual = manager.searchBy("Product");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSeveralSmartphonesByName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = new Smartphone[]{smartphone1, smartphone2, smartphone3};
        Product[] actual = manager.searchBy("Smartphone");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSeveralBooksByName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(book2);

        Product[] expected = new Book[]{book1, book2};
        Product[] actual = manager.searchBy("Book");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchProductByNonExistentName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] expected = new Product[0];
        Product[] actual = manager.searchBy("ABC");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchSmartphoneByNonExistentName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);
        manager.add(smartphone5);

        Product[] expected = new Smartphone[0];
        Product[] actual = manager.searchBy("ABC");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBookByNonExistentName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = new Book[0];
        Product[] actual = manager.searchBy("ABC");
        Assertions.assertArrayEquals(expected, actual);
    }
}

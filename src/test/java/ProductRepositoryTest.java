import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Book;
import ru.netology.Product;
import ru.netology.ProductRepository;
import ru.netology.Smartphone;

public class ProductRepositoryTest {
    Product product1 = new Product(1, "Product1", 40);
    Product product2 = new Product(2, "Product2", 60);
    Product product3 = new Product(3, "Product3", 20);

    Book book1 = new Book(11, "Book1", 1800, "Author1");
    Book book2 = new Book(12, "Book2", 1200, "Author2");
    Book book3 = new Book(13, "Book3", 1500, "Author3");
    Book book4 = new Book(14, "Book4", 1000, "Author4");

    Smartphone smartphone1 = new Smartphone(21, "Smartphone1", 15000, "Manufacturer1");
    Smartphone smartphone2 = new Smartphone(22, "Smartphone2", 95000, "Manufacturer2");
    Smartphone smartphone3 = new Smartphone(23, "Smartphone3", 56000, "Manufacturer3");
    Smartphone smartphone4 = new Smartphone(24, "Smartphone4", 38000, "Manufacturer4");
    Smartphone smartphone5 = new Smartphone(25, "Smartphone5", 21000, "Manufacturer5");


    @Test
    public void removeProductById() {
        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.removeById(product2.getId());

        Product[] expected = {product1, product3};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeBookById() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.removeById(book3.getId());

        Book[] expected = {book1, book2, book4};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeLastBookById() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.removeById(book4.getId());

        Book[] expected = {book1, book2, book3};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeFirstBookById() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(book4);
        repo.removeById(book1.getId());

        Book[] expected = {book2, book3, book4};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeSmartphoneById() {
        ProductRepository repo = new ProductRepository();
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);
        repo.save(smartphone4);
        repo.save(smartphone5);
        repo.removeById(smartphone3.getId());

        Smartphone[] expected = {smartphone1, smartphone2, smartphone4, smartphone5};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeLastSmartphoneById() {
        ProductRepository repo = new ProductRepository();
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);
        repo.save(smartphone4);
        repo.save(smartphone5);
        repo.removeById(smartphone5.getId());

        Smartphone[] expected = {smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeFirstSmartphoneById() {
        ProductRepository repo = new ProductRepository();
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.save(smartphone3);
        repo.save(smartphone4);
        repo.save(smartphone5);
        repo.removeById(smartphone1.getId());

        Smartphone[] expected = {smartphone2, smartphone3, smartphone4, smartphone5};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }
}

package Bridge_media_package;

import java.util.ArrayList;

/**
 * MediaBook is the class for all media material of type book. It inherits from
 * Media superclass.
 * <p>
 * The MediaBook class encapsulates all state information related to books.
 * These state information includes: </p>
 * <ul>
 * <li>ISBN</li>
 * <li>Author(s)</li>
 * <li>Edition</li>
 * <li>Volume</li>
 * <li>Number of pages</li>
 * <li>Publisher</li>
 * </ul>
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class MediaBook extends Media {

    private String bookIsbn;
    private String bookEdition;
    private String bookVolume;
    private String bookPages;
    private String bookPublisher;
    private ArrayList<String> bookAuthors;

    /**
     * Loan period is the duration of a loan in days.
     */
    public static int LOAN_PERIOD = 28;

    /**
     * Late fee is the amount of money charged in cents per late day by the
     * Patron.
     */
    public static double LATE_FEE = 0.10;

    /**
     * RENEWABLE is true if media can be renewed by the patron, or false
     * otherwise.
     */
    public static boolean RENEWABLE = true;

    /**
     * RENEW_TIMES represents how many times a patron can renew a media.
     */
    public static int RENEW_TIMES = 2;

    /**
     * Constructor for MediaBook.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param isbn Book ISBN
     * @param edition Book edition as an integer number (1, 2, ...)
     * @param volume
     * @param pages
     * @param publisher Book publisher name
     */
    public MediaBook(String id, String title, String year, String isbn,
            String edition, String volume, String pages, String publisher, 
            String cost) {
        super(id, title, year, cost);
    }

    /**
     * This methods edits an existing media of type book in the catalog.
     * <p>
     * This method receives all editable attributes (all except mediaID) when
     * the use submits the modifications to update the entry in the catalog.</p>
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     * @param isbn Book ISBN
     * @param edition Book edition as an integer number (1, 2, ...)
     * @param publisher Book publisher name
     */
  
    
    public void editMedia(String id, String title, String year, String isbn,
            int edition, String publisher, String cost) {
    }

    /**
     * Returns the ISBN code
     *
     * @return ISBN code
     */
    public String getIsbn() {
        return bookIsbn;
    }

    /**
     * Returns the book edition
     *
     * @return book edition
     */
    public String getEdition() {
        return bookEdition;
    }

    /**
     * Returns the book volume
     *
     * @return book volume
     */
    public String getVolume() {
        return bookVolume;
    }

    /**
     * Returns the number of pages
     *
     * @return number of pages
     */
    public String getNumbeOfPages() {
        return bookPages;
    }

    /**
     * Returns the publisher name.
     *
     * @return publisher name
     */
    public String getPublisher() {
        return bookPublisher;
    }

    /**
     * Returns all the authors for the book.
     *
     * @return an ArrayList of strings with the name of all authors.
     */
    public ArrayList<String> getAuthors() {
        return bookAuthors;
    }

    /**
     * Sets the ISBN code
     *
     * @param isbn ISBN code
     */
    public void setIsbn(String isbn) {
    }

    /**
     * Sets the book edition
     *
     * @param edition book edition
     */
    public void setEdition(int edition) {
    }

    /**
     * Sets the book volume
     *
     * @param volume book volume
     */
    public void setVolume(int volume) {
    }

    /**
     * Sets the publisher name
     *
     * @param publisher publisher name
     */
    public void setPublisher(String publisher) {
    }

    /**
     * Sets the authors list for the book.
     *
     * @param authors an ArrayList of strings with the name of all authors.
     */
    public void setAuthors(ArrayList<String> authors) {
    }

}
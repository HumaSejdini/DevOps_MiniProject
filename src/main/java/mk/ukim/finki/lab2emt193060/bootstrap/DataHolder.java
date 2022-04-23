package mk.ukim.finki.lab2emt193060.bootstrap;

import lombok.Getter;
import mk.ukim.finki.lab2emt193060.service.AuthorService;
import mk.ukim.finki.lab2emt193060.service.BookService;
import mk.ukim.finki.lab2emt193060.service.CategoryService;
import mk.ukim.finki.lab2emt193060.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static mk.ukim.finki.lab2emt193060.model.enumeration.Category.NOVEL;

@Component
@Getter
public class DataHolder {
    private final AuthorService authorService;
    private final BookService bookService;
    private final CountryService countryService;
    private final CategoryService categoryService;

    public DataHolder(AuthorService authorService, BookService bookService, CountryService countryService, CategoryService categoryService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.countryService = countryService;
        this.categoryService = categoryService;
    }

    @PostConstruct
    void initData(){

        this.countryService.save("USA", "Amerika");
        this.countryService.save("England","Europe");
        this.authorService.save("Stephen", "King", 1l);
        this.authorService.save("William","Shakespeare",2l);
        this.categoryService.create("NOVEL","NOVEL");
        this.categoryService.create("THRILER","THRILER");
        this.categoryService.create("HISTORY","HISTORY");
        this.categoryService.create("FANTASY","FANTASY");
        this.categoryService.create("BIOGRAPHY","BIOGRAPHY");
        this.categoryService.create("CLASSICS","CLASSICS");
        this.categoryService.create("DRAMA","DRAMA");

        this.bookService.save("Carrie", 1l, 1l, 10);
        this.bookService.save("Hamlet",2l,2l,15);
        this.bookService.save("King Lear",3l,2l,40);
        this.bookService.save("Salem's Lot", 4l, 1l, 40);
        this.bookService.save("The Tempest",4l,2l,55);
        this.bookService.save("Firt Folio",3l,2l,33);
        this.bookService.save("Macbeth",4l,2l,20);
        this.bookService.save("The Stand", 1l, 1l, 50);
        this.bookService.save("The Long Walk", 6l, 1l, 30);
        this.bookService.save("Othello",5l,2l,60);
        this.bookService.save("A Midsummer Night's Dream",6l,2l,10);
        this.bookService.save("Firestarter", 4l, 1l, 35);
        this.bookService.save("Roadwork", 1l, 1l, 20);
        this.bookService.save("The Sonnets",7l,2l,40);
        this.bookService.save("Romeo and Juliet",2l,2l,50);
        this.bookService.save("Much Ado about Nothing",3l,2l,15);
        this.bookService.save("The Running Man", 7l, 1l, 45);
        this.bookService.save("The Green Miler", 5l, 1l, 55);

    }
}

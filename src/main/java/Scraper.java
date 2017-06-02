import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * Created by Antons on 2017-02-27.
 */
public class Scraper {
	String result;
	
	public Scraper(String result) {
		this.result = result;
	}

    public void imdbscraper() throws Exception {
        final Document document = Jsoup.connect("http://www.imdb.com/chart/top").get();

        for(Element row : document.select("table.chart.full-width tr")) {

            final String title = row.select(".titleColumn a").text();
            final String rating = row.select(".imdbRating").text();

            result = (title + " || " + rating);
            
            //System.out.println(result);
            //för testning

        }
    }
    
    public String getResult() {
    	return result;
    }

}
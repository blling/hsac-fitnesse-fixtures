package nl.hsac.fitnesse.fixture.util.selenium;

import nl.hsac.fitnesse.fixture.util.selenium.by.HeuristicBy;
import nl.hsac.fitnesse.fixture.util.selenium.by.SingleElementOrNullBy;
import nl.hsac.fitnesse.fixture.util.selenium.by.XPathBy;

/**
 * By to find list item.
 */
public class ListItemBy {
    public static SingleElementOrNullBy numbered(String text) {
        return new Numbered(text);
    }

    public static class Numbered extends HeuristicBy {
        public Numbered(String text) {
            super(new XPathBy(".//ol/li/descendant-or-self::text()[normalized(.)='%s']/ancestor-or-self::li", text),
                    new XPathBy(".//ol/li/descendant-or-self::text()[contains(normalized(.),'%s')]/ancestor-or-self::li", text));
        }
    }
}

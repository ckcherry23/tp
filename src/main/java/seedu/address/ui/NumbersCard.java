package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import seedu.address.commons.core.LogsCenter;
import seedu.address.model.person.Phone;

import java.util.Map;
import java.util.logging.Logger;


public class NumbersCard extends UiPart<Region> {
    private static final String FXML = "NumbersCard.fxml";
    private final Logger logger = LogsCenter.getLogger(NumbersCard.class);

    @FXML
    private VBox numbersContainer;

    /**
     * Creates a {@code PersonListPanel} with the given {@code ObservableList}.
     */
    public NumbersCard(Map<String, Phone> numbers) {
        super(FXML);
        for (Map.Entry<String, Phone> number : numbers.entrySet()) {
            numbersContainer.getChildren().add(new InfoBox(number.getKey(), number.getValue().value).getRoot());
        }
    }
}
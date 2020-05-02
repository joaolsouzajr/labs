package demogriffonfx;
import griffon.core.artifact.GriffonView;
import griffon.javafx.support.JavaFXAction;
import griffon.javafx.support.JavaFXUtils;
import griffon.javafx.support.fontawesome.FontAwesomeIcon;
import griffon.metadata.ArtifactProviderFor;
import griffon.plugins.fontawesome.FontAwesome;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.codehaus.griffon.runtime.javafx.artifact.AbstractJavaFXGriffonView;

import static javafx.scene.layout.AnchorPane.setLeftAnchor;
import static javafx.scene.layout.AnchorPane.setTopAnchor;

@ArtifactProviderFor(GriffonView.class)
public class Tab1View extends AbstractJavaFXGriffonView {
    private SampleController controller;
    private SampleModel model;
    private Demogriffonfx2View parentView;

    @Override
    public void initUI() {
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefHeight(90.0);
        anchorPane.setPrefWidth(384.0);

        Label label = new Label(getApplication().getMessageSource().getMessage("name.label"));
        TextField input = new TextField();
        input.setPrefWidth(200.0);

        Button button = new Button();
        button.setPrefWidth(200.0);
        JavaFXUtils.configure(button, (JavaFXAction) actionFor(controller, "sayHello").getToolkitAction());

        Label output = new Label();
        label.setPrefWidth(360.0);

        model.inputProperty().bindBidirectional(input.textProperty());
        model.outputProperty().bindBidirectional(output.textProperty());

        anchorPane.getChildren().addAll(label, input, button, output);

        setLeftAnchor(label, 14.0);
        setTopAnchor(label, 14.0);
        setLeftAnchor(input, 172.0);
        setTopAnchor(input, 11.0);
        setLeftAnchor(button, 172.0);
        setTopAnchor(button, 45.0);
        setLeftAnchor(output, 14.0);
        setTopAnchor(output, 80.0);

        Tab tab = new Tab("Java");
        tab.setGraphic(new FontAwesomeIcon(FontAwesome.FA_COFFEE));
        tab.setClosable(false);
        tab.setContent(anchorPane);
        parentView.getTabPane().getTabs().add(tab);
    }
}
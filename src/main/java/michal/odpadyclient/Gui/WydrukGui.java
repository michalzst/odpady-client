package michal.odpadyclient.Gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import michal.odpadyclient.Client.WydrukClient;
import michal.odpadyclient.Objects.Wydruk;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@Route("get")
public class WydrukGui extends VerticalLayout {
    private Label label;
    private WydrukClient wydrukClient;
    private Button thumbsUpButton;
    private List<Wydruk> wydrukList;
    private Grid<Wydruk> grid;

    private ListDataProvider<Wydruk> dataProvider;

    private String filter = "Filter";
    private String colNameId = "Id";
    private String colNameData = "Data wydruku";
    private String colNameNrRejPoj = "Pojazd";
    private String colNameKod = "Kod odpadu";
    private String colNameMasa = "Masa odpadu";
    private String colNameKontrahent = "Kontrahent";
    private String columnWaga = "Waga";
    private String colNamePosiadacz = "Posiadacz";
    private String colInfo = "Dodatkowe informacje";

    @Autowired
    public WydrukGui(WydrukClient wydrukClient) {
        this.wydrukClient = wydrukClient;
        this.wydrukList = Arrays.asList(wydrukClient.getWydruk());
        this.grid = new Grid<>();

        this.dataProvider = new ListDataProvider<>(wydrukList);

        grid.setDataProvider(dataProvider);

        Grid.Column<Wydruk> idColumn = grid.addColumn((Wydruk::getId), colNameId).setHeader(colNameId).setFlexGrow(0);
        Grid.Column<Wydruk> dataColumn = grid.addColumn((Wydruk::getData), colNameData).setHeader(colNameData);
        Grid.Column<Wydruk> nrRejPojColumn = grid.addColumn(Wydruk::getNrRejDoGrida, colNameNrRejPoj).setHeader(colNameNrRejPoj);
        Grid.Column<Wydruk> kodColumn = grid.addColumn((Wydruk::getKodDoGrida), colNameKod).setHeader(colNameKod);
        Grid.Column<Wydruk> masaColumn = grid.addColumn((Wydruk::getMasa), colNameMasa).setHeader(colNameMasa);
        Grid.Column<Wydruk> kontrahentColumn = grid.addColumn((Wydruk::getKontrahentDoGrida), colNameKontrahent).setHeader(colNameKontrahent).setFlexGrow(0).setWidth("150px");
        Grid.Column<Wydruk> wagaColumn = grid.addColumn((Wydruk::getStaraNowaWaga), columnWaga).setHeader(columnWaga).setFlexGrow(0).setWidth("100px");
        Grid.Column<Wydruk> posiadaczColumn = grid.addColumn((Wydruk::getPosiadaczDoGrida), colNamePosiadacz).setHeader(colNamePosiadacz);
        Grid.Column<Wydruk> dodInfoColumn = grid.addColumn((Wydruk::getDodatkoweInformacje), colInfo).setHeader(colInfo);

        grid.setSelectionMode(Grid.SelectionMode.NONE);
        grid.setHeightByRows(true);
        HeaderRow filterRow = grid.appendHeaderRow();

        // I column (idColumn) filter
        TextField idField = new TextField();
        idField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getId()), idField.getValue())));
        idField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(idColumn).setComponent(idField);
        idField.setSizeFull();
        idField.setPlaceholder(filter);

        // II column (dataColumn) filter
        TextField dataField = new TextField();
        dataField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getData()), dataField.getValue())));
        dataField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(dataColumn).setComponent(dataField);
        dataField.setSizeFull();
        dataField.setPlaceholder(filter);

        // III column (nrRejPojColumn) filter
        TextField nrRejField = new TextField();
        nrRejField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getNrRejDoGrida()), nrRejField.getValue())));
        nrRejField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(nrRejPojColumn).setComponent(nrRejField);
        nrRejField.setSizeFull();
        nrRejField.setPlaceholder(filter);

        // IV column (kodColumn) filter
        TextField kodField = new TextField();
        kodField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getKodDoGrida()), kodField.getValue())));
        kodField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(kodColumn).setComponent(kodField);
        kodField.setSizeFull();
        kodField.setPlaceholder(filter);

        // V column (masaColumn) filter
        TextField masaField = new TextField();
        masaField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getMasa()), masaField.getValue())));
        masaField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(masaColumn).setComponent(masaField);
        masaField.setSizeFull();
        masaField.setPlaceholder(filter);

        // VI column (kontrahentColumn) filter
        TextField kontrahentField = new TextField();
        kontrahentField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getKontrahentDoGrida()), kontrahentField.getValue())));
        kontrahentField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(kontrahentColumn).setComponent(kontrahentField);
        kontrahentField.setSizeFull();
        kontrahentField.setPlaceholder(filter);

        // VII column (wagaColumn) filter
        TextField wagaField = new TextField();
        wagaField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getStaraNowaWaga()), wagaField.getValue())));
        wagaField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(wagaColumn).setComponent(wagaField);
        wagaField.setSizeFull();
        wagaField.setPlaceholder(filter);

        // VIII column (posiadaczColumn) filter
        TextField posiadaczField = new TextField();
        posiadaczField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getPosiadaczDoGrida()), posiadaczField.getValue())));
        posiadaczField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(posiadaczColumn).setComponent(posiadaczField);
        posiadaczField.setSizeFull();
        posiadaczField.setPlaceholder(filter);

        // VIX column (dodInfoColumn) filter
        TextField dodInfoField = new TextField();
        dodInfoField.addValueChangeListener(event -> dataProvider
                .addFilter(wydruk -> StringUtils.containsIgnoreCase(
                        String.valueOf(wydruk.getDodatkoweInformacje()), dodInfoField.getValue())));
        dodInfoField.setValueChangeMode(ValueChangeMode.EAGER);
        filterRow.getCell(dodInfoColumn).setComponent(dodInfoField);
        dodInfoField.setSizeFull();
        dodInfoField.setPlaceholder(filter);

        add(grid);
    }
}

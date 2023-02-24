package mate.jdbc;

import mate.jdbc.dao.ManufacturerDaoImpl;
import mate.jdbc.lib.Injector;
import mate.jdbc.model.Manufacturer;
import mate.jdbc.service.ManufactureServiceImpl;
import mate.jdbc.service.ManufacturerService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");

    public static void main(String[] args) {

        final ManufacturerService manufacturerService =
                new ManufactureServiceImpl(new ManufacturerDaoImpl());

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(3L);
        manufacturer.setName("Audi");
        manufacturer.setCountry("German");

        manufacturerService.createManufacturer(manufacturer);
        manufacturerService.getManufacturer(2L);
        manufacturerService.getAllManufacturer();
        manufacturerService.updateManufacturer(manufacturer);
        manufacturerService.deleteManufacturer(3L);

    }
}

@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        
        testGetAllCountries();
        testAddCountry();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("Countries={}", countries);
        LOGGER.info("End");
    }

    private static void testAddCountry() {
        Country newCountry = new Country();
        newCountry.setCode("TN");
        newCountry.setName("Tamil Nadu");
        countryService.addCountry(newCountry);
        LOGGER.info("Country Added Successfully");
    }
}
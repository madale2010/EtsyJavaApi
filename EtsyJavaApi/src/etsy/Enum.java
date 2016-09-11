package etsy;

public class Enum {
	public enum Occasion{anniversary, baptism, bar_or_bat_mitzvah, birthday, canada_day, chinese_new_year, cinco_de_mayo, confirmation, christmas, day_of_the_dead, easter, eid, engagement, fathers_day, get_well, graduation, halloween, hanukkah, housewarming, kwanzaa, prom, july_4th, mothers_day, new_baby, new_years, quinceanera, retirement, st_patricks_day, sweet_16, sympathy, thanksgiving, valentines, wedding};
	public enum Recipient{men, women, unisex_adults, teen_boys, teen_girls, teens, boys, girls, children, baby_boys, baby_girls, babies, birds, cats, dogs, pets, not_specified};
	public enum WhoMade {i_did, collective, someone_else};
	public class WhenMade {
	public static final String CUSTOM="made_to_order";
	public static final String CURRENT="2010_2016";
	public static final String BETWEEN_00_09="2000_2009";
	public static final String BETWEEN_97_99="1997_1999";
	public static final String BEFORE_97="before_1997";
	public static final String BETWEEN_90_96="1990_1996";
	public static final String YEAR_1980="1980s";
	public static final String YEAR_1970="1970s";
	public static final String YEAR_1960="1960s";
	public static final String YEAR_1950="1950s";
	public static final String YEAR_1940="1940s";
	public static final String YEAR_1930="1930s";
	public static final String YEAR_1920="1920s";
	public static final String YEAR_1910="1910s";
	public static final String YEAR_1900="1900s";
	public static final String YEAR_1800="1800s";
	public static final String YEAR_1700="1700s";
	public static final String BEFORE_1700="before_1700";
	}
}

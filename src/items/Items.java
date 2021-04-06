package items;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Items {

//	    private static final HashMap<String, String> map = new HashMap<>();
//	    private static Items instance = new Items();
//
//	    private Items() {
//	    }
//
//	    public static Items getInstance() {
//	        return instance;
//	    }

//	    public static String getValue(String key) {
//	        return map.get(key);
//	    }
//
//	    public static void add(String[][] pairs) {
//	        for(String[] pair : pairs) {
//	            map.put(pair[0], pair[1]);
//	        }
//	    }
//
//	    public static void add(String[] keys, String[] values) {
//	        for (int i = 0; i < keys.length; ++i) {
//	            map.put(keys[i], values[i]);
//	        }
//	    }
	    
//*************************************************Mens section*********************************************	    
	    public static LinkedHashMap getPantIns()
	    {
	    	LinkedHashMap<String, Integer> pantMap = new LinkedHashMap<>(); 
	    	pantMap.put("Lee", 3451); 
	    	pantMap.put("Wrengler Pant", 1732); 
	    	pantMap.put("Van Heusen", 2682); 
	    	pantMap.put("Pepe Jeans", 1261); 
	    	pantMap.put("Allen Solly Jeans", 3990); 
	    	pantMap.put("Levis Pant", 1999); 
	    	pantMap.put("Flying Machine Trouser", 1099); 
	    	return pantMap;
	    }
	    public static LinkedHashMap getShirtsIns()
	    {
	    	LinkedHashMap<String, Integer> shirtMap = new LinkedHashMap<>(); 
	    	shirtMap.put("Levis Shirt", 999); 
	    	shirtMap.put("Wrengler Shirt", 2671); 
	    	shirtMap.put("Zara Shirt", 1899); 
	    	shirtMap.put("Peter England", 879); 
	    	shirtMap.put("Allen Solly", 950);
	    	return shirtMap;
	    }
	    
	    
	    public static LinkedHashMap getShooesIns()
	    {
	    	LinkedHashMap<String, Integer> shooesMap = new LinkedHashMap<>(); 
	    	shooesMap.put("Reebok", 2999); 
	    	shooesMap.put("WoodLand", 1549); 
	    	shooesMap.put("Nike", 2199); 
	    	shooesMap.put("Puma", 2250); 
	    	shooesMap.put("Adidas", 1729);
	    	return shooesMap;
	    }
//*****************************************************************************************	   
	    
	    
	    
//******************************************Womens section*********************************
	    public static LinkedHashMap getJeansIns()
	    {
	    	LinkedHashMap<String, Integer> jeansMap = new LinkedHashMap<>(); 
	    	jeansMap.put("Levis for Girl", 2299); 
	    	jeansMap.put("Wrengler for Girl", 1649); 
	    	jeansMap.put("Flying Machine for Girl", 1199); 
	    	jeansMap.put("Zara for Girl", 2240); 
	    	jeansMap.put("Pepe Jeans for Girl", 1529);
	    	return jeansMap;
	    }
	    
	    public static LinkedHashMap getKurtisIns()
	    {
	    	LinkedHashMap<String, Integer> kurtisMap = new LinkedHashMap<>(); 
	    	kurtisMap.put("Gobal Desi", 399); 
	    	kurtisMap.put("Soch", 549); 
	    	kurtisMap.put("Rangmanch", 529); 
	    	kurtisMap.put("Libas", 750); 
	    	kurtisMap.put("Biba", 729);
	    	return kurtisMap;
	    }
	    public static LinkedHashMap getTopsIns()
	    {
	    	LinkedHashMap<String, Integer> topsMap = new LinkedHashMap<>(); 
	    	topsMap.put("Nike T-Shirt", 2399); 
	    	topsMap.put("WoodLand T-Shirt", 1529); 
	    	topsMap.put("Live Stauss T-Shirt", 2699); 
	    	topsMap.put("Gucci T-Shirt", 2240); 
	    	topsMap.put("AdidasT-Shirt", 1429);
	    	return topsMap;
	    }
	    
	    public static LinkedHashMap getSandleIns()
	    {
	    	LinkedHashMap<String, Integer> sandleMap = new LinkedHashMap<>(); 
	    	sandleMap.put("Girls Bata Shoes", 2939); 
	    	sandleMap.put("CatWalk Sandle", 1547); 
	    	sandleMap.put("Levis Womens", 2129); 
	    	sandleMap.put("Girls Puma Sports Shoes", 2230); 
	    	sandleMap.put("Adidas Slipper For Girls", 1799);
	    	return sandleMap;
	    }
	    
	    
//*****************************************************************************************
	    
	    
//******************************************Kids*******************************************
	    
	    
	    public static LinkedHashMap getKPantIns()
	    {
	    	LinkedHashMap<String, Integer> kpantMap = new LinkedHashMap<>(); 
	    	kpantMap.put("Lee Pant Kids", 3454); 
	    	kpantMap.put("Wrengler Pant Kids", 1732); 
	    	kpantMap.put("Van Heusen Pant Kids", 2685); 
	    	kpantMap.put("Pepe Jeans Pant Kids", 1265); 
	    	kpantMap.put("Allen Solly Jeans Kids", 3994); 
	    	kpantMap.put("Levis  Pant Kids", 1998); 
	    	kpantMap.put("Flying Machine Trouser Kids", 1097); 
	    	return kpantMap;
	    }
	    
	    public static LinkedHashMap getKShirtsIns()
	    {
	    	LinkedHashMap<String, Integer> kshirtMap = new LinkedHashMap<>(); 
	    	kshirtMap.put("Levis Shirt for Kids", 949); 
	    	kshirtMap.put("Wrengler Shirt for Kids", 231); 
	    	kshirtMap.put("Zara Shirt for Kids", 899); 
	    	kshirtMap.put("Peter England for Kids", 849); 
	    	kshirtMap.put("Allen Solly for Kids", 930);
	    	return kshirtMap;
	    }
	    
	    
	    public static LinkedHashMap getKShooesIns()
	    {
	    	LinkedHashMap<String, Integer> kshooesMap = new LinkedHashMap<>(); 
	    	kshooesMap.put("Reebok for Kids", 2499); 
	    	kshooesMap.put("WoodLand for Kids", 1539); 
	    	kshooesMap.put("Nike for Kids", 2099); 
	    	kshooesMap.put("Puma for Kids", 1250); 
	    	kshooesMap.put("Adidas for Kids", 1759);
	    	return kshooesMap;
	    }
	    
	    public static LinkedHashMap getDipperIns()
	    {
	    	LinkedHashMap<String, Integer> dipperMap = new LinkedHashMap<>(); 
	    	dipperMap.put("Huggies Overnite Diapers", 299); 
	    	dipperMap.put("Pampers Diapers", 549); 
	    	dipperMap.put("Luvs Ultra ", 239); 
	    	dipperMap.put("mamypoko pants", 225); 
	    	dipperMap.put("Nature Babycare Eco-Diapers", 175);
	    	return dipperMap;
	    }
	    
	    
	    
//*****************************************************************************************	   
	    
	    
	    	    
	    
	    
//*****************************************Electonics***************************************	    
	    
	    
	    public static LinkedHashMap getMobileIns()
	    {
	    	LinkedHashMap<String, Integer> mobileMap = new LinkedHashMap<>(); 
	    	mobileMap.put("Samsung", 16000); 
	    	mobileMap.put("OnePlus", 52000); 
	    	mobileMap.put("Redmi", 13000); 
	    	mobileMap.put("Vivo", 10000); 
	    	mobileMap.put("RealMe", 8000);
	    	return mobileMap;
	    }
	    
	    public static LinkedHashMap getEarphoneIns()
	    {
	    	LinkedHashMap<String, Integer> earphoneMap = new LinkedHashMap<>(); 
	    	earphoneMap.put("SennHeiser", 2345); 
	    	earphoneMap.put("SkullCandy", 549); 
	    	earphoneMap.put("Boat", 697); 
	    	earphoneMap.put("JBL", 1922); 
	    	earphoneMap.put("Philips", 370);
	    	return earphoneMap;
	    }
	    
	    public static LinkedHashMap getBackCoverIns()
	    {
	    	LinkedHashMap<String, Integer> backCoverMap = new LinkedHashMap<>(); 
	    	backCoverMap.put("Samsung Back Cover", 99); 
	    	backCoverMap.put("OnePlus Back Cover", 149); 
	    	backCoverMap.put("Redmi Back Cover", 249); 
	    	backCoverMap.put("Vivo Back Cover", 399); 
	    	backCoverMap.put("RealMe Back Cover", 279);
	    	return backCoverMap;
	    }
	    
	    public static LinkedHashMap getTrimmerIns()
	    {
	    	LinkedHashMap<String, Integer> trimmerMap = new LinkedHashMap<>(); 
	    	trimmerMap.put("Philips Trimmer", 1999); 
	    	trimmerMap.put("MI Beared Trimmer", 1199); 
	    	trimmerMap.put("Nova Trimmer", 649); 
	    	trimmerMap.put("Syska Ultra Trim", 949); 
	    	trimmerMap.put("Braun Trimmer", 749);
	    	return trimmerMap;
	    }
	    
//*****************************************************************************************	    
	    

//******************************************Groceries*******************************************
	  	    
	  	    
	  	    public static LinkedHashMap getRiceIns()
	  	    {
	  	    	LinkedHashMap<String, Integer> riceMap = new LinkedHashMap<>(); 
	  	    	riceMap.put("Basmati", 80); 
	  	    	riceMap.put("Jasmine Rice", 65); 
	  	    	riceMap.put("Brown Rice", 45); 
	  	    	riceMap.put("White Rice", 76); 
	  	    	riceMap.put("Boiled Rice", 92); 
	  	    	riceMap.put("Paraboiled Rice", 59);  
	  	    	return riceMap;
	  	    }
	  	    
	  	    public static LinkedHashMap getPulsesIns()
	  	    {
	  	    	LinkedHashMap<String, Integer> pulsesMap = new LinkedHashMap<>(); 
	  	    	pulsesMap.put("Dry Beans", 68); 
	  	    	pulsesMap.put("Dry Peas", 93); 
	  	    	pulsesMap.put("ChickPeas", 78); 
	  	    	pulsesMap.put("Pigeon Peas", 99); 
	  	    	pulsesMap.put("Lupins", 73);
	  	    	pulsesMap.put("FabaBeans", 82);
	  	    	pulsesMap.put("CowPeas", 85);
	  	    	pulsesMap.put("Urad Ki Daal", 56);
	  	    	pulsesMap.put("Masoor Ki Daal", 90);
	  	    	pulsesMap.put("Moong Ki Daal", 82);
	  	    	return pulsesMap;
	  	    }
	  	    
	  	    public static LinkedHashMap getSpicesIns()
	  	    {
	  	    	LinkedHashMap<String, Integer> spicesMap = new LinkedHashMap<>(); 
	  	    	spicesMap.put("Chilli Powder", 230); 
	  	    	spicesMap.put("Turmric Powder", 180); 
	  	    	spicesMap.put("Coriander Powder", 159); 
	  	    	spicesMap.put("Black Papper", 900); 
	  	    	spicesMap.put("Salt", 34);
	  	    	spicesMap.put("Cardamom", 1000);
	  	    	spicesMap.put("Clove", 1149);
	  	    	return spicesMap;
	  	    }
	  	    
	  	    public static LinkedHashMap getOilIns()
	  	    {
	  	    	LinkedHashMap<String, Integer> oilMap = new LinkedHashMap<>(); 
	  	    	oilMap.put("Mustard Oil", 110); 
	  	    	oilMap.put("Palm Oil", 150); 
	  	    	oilMap.put("Peanuts Oil", 149); 
	  	    	oilMap.put("SufFlower Oil", 180); 
	  	    	oilMap.put("Refined Oil", 130);
	  	    	return oilMap;
	  	    }
	  	    
	  //*****************************************************************************************	   



	  	//******************************************HouseHold*******************************************
	  		    
	  		    public static LinkedHashMap getUtensilsIns()
	  		    {
	  		    	LinkedHashMap<String, Integer> utensilsMap = new LinkedHashMap<>(); 
	  		    	utensilsMap.put("Spatuals", 130); 
	  		    	utensilsMap.put("Tongs", 70); 
	  		    	utensilsMap.put("Pressure Cooker", 1600); 
	  		    	utensilsMap.put("Vessel", 999); 
	  		    	utensilsMap.put("Knives", 99); 
	  		    	utensilsMap.put("Spoon", 69); 
	  		    	utensilsMap.put("Cutting Board", 199); 
	  		    	utensilsMap.put("Pots and Pans", 1179); 
	  		    	utensilsMap.put("Backing Sheets", 299); 
	  		    	utensilsMap.put("Bottle", 79); 
	  		    	return utensilsMap;
	  		    }
	  		    
	  		    public static LinkedHashMap getFurnitureIns()
	  		    {
	  		    	LinkedHashMap<String, Integer> furnitureMap = new LinkedHashMap<>(); 
	  		    	furnitureMap.put("Single Bed", 12000); 
	  		    	furnitureMap.put("Double Bed", 20500); 
	  		    	furnitureMap.put("Couch", 8000); 
	  		    	furnitureMap.put("Dinning Table", 6000); 
	  		    	furnitureMap.put("Arm Chair", 1200); 
	  		    	furnitureMap.put("Rocking Chair", 950);
	  		    	furnitureMap.put("Stool", 750);
	  		    	furnitureMap.put("BookShelf", 2300);
	  		    	return furnitureMap;
	  		    }
	  		    
	  		    public static LinkedHashMap getKitchenIns()
	  		    {
	  		    	LinkedHashMap<String, Integer> kitchenMap = new LinkedHashMap<>(); 
	  		    	kitchenMap.put("Trash Bag", 80); 
	  		    	kitchenMap.put("Dish Soap", 35); 
	  		    	kitchenMap.put("Dish Towel", 230); 
	  		    	kitchenMap.put("Aluminium Foil", 110); 
	  		    	kitchenMap.put("Napkins", 50);
	  		    	kitchenMap.put("Drying Rack", 1500);
	  		    	kitchenMap.put("Sponges", 40);
	  		    	kitchenMap.put("Ice Cube Trays", 157);
	  		    	kitchenMap.put("Huks", 150);
	  		    	kitchenMap.put("Step Stools", 3000);
	  		    	return kitchenMap;
	  		    }
	  		    
	  		    public static LinkedHashMap getBedRoomIns()
	  		    {
	  		    	LinkedHashMap<String, Integer> bedRoomMap = new LinkedHashMap<>(); 
	  		    	bedRoomMap.put("Mattress", 1999); 
	  		    	bedRoomMap.put("Pillows", 249); 
	  		    	bedRoomMap.put("Bed Frame", 1549); 
	  		    	bedRoomMap.put("Lamp", 550); 
	  		    	bedRoomMap.put("Dresser", 3000);
	  		    	bedRoomMap.put("Curtains", 380);
	  		    	bedRoomMap.put("Alarm Clock", 800);
	  		    	bedRoomMap.put("Laundry Humper", 199);
	  		    	return bedRoomMap;
	  		    }
	  		    
//*********************************************************************************************************	   
	    
}

import java.util.Scanner;

public class ClimateChangeCalculations {

    // Method to calculate sea level rise
    public static double calculateSeaLevelRise(double currentLevel, double pastLevel, int years) {
        return (currentLevel - pastLevel) / years;
    }

    // Method to calculate temperature change
    public static double calculateTemperatureChange(double currentTemp, double pastTemp, int years) {
        return (currentTemp - pastTemp) / years;
    }

    // Method to calculate increase in extreme weather events
    public static double calculateExtremeEventIncrease(int currentEvents, int pastEvents, int years) {
        return (currentEvents - pastEvents) / (double) years;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate sea level rise
        System.out.print("Enter current sea level (meters): ");
        double currentSeaLevel = scanner.nextDouble();
        System.out.print("Enter past sea level (meters): ");
        double pastSeaLevel = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int yearsForSeaLevel = scanner.nextInt();

        double seaLevelRise = calculateSeaLevelRise(currentSeaLevel, pastSeaLevel, yearsForSeaLevel);
        System.out.printf("Sea level rise rate: %.2f meters/year%n", seaLevelRise);

        // Calculate temperature change
        System.out.print("Enter current temperature (°C): ");
        double currentTemperature = scanner.nextDouble();
        System.out.print("Enter past temperature (°C): ");
        double pastTemperature = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int yearsForTemperature = scanner.nextInt();

        double temperatureChange = calculateTemperatureChange(currentTemperature, pastTemperature, yearsForTemperature);
        System.out.printf("Temperature change rate: %.2f °C/year%n", temperatureChange);

        // Calculate increase in extreme weather events
        System.out.print("Enter current number of extreme weather events: ");
        int currentExtremeEvents = scanner.nextInt();
        System.out.print("Enter past number of extreme weather events: ");
        int pastExtremeEvents = scanner.nextInt();
        System.out.print("Enter number of years: ");
        int yearsForEvents = scanner.nextInt();

        double extremeEventIncrease = calculateExtremeEventIncrease(currentExtremeEvents, pastExtremeEvents, yearsForEvents);
        System.out.printf("Increase in extreme weather events rate: %.2f events/year%n", extremeEventIncrease);

        scanner.close();
    }
}
تاني مشكله:
        import java.util.Scanner;

public class ClimateImpactCalculations {

    // Method to calculate the rate of ocean level rise
    public static double calculateOceanLevelRise(double currentLevelMax, double pastLevelMin, int yearMax, int yearMin) {
        return (currentLevelMax - pastLevelMin) / (yearMax - yearMin);
    }

    // Method to calculate the average number of floods
    public static double calculateAverageFloods(int[] floodEvents, int count) {
        int sum = 0;
        for (int events : floodEvents) {
            sum += events;
        }
        return (double) sum / count;
    }

    // Method to calculate the average affected population
    public static double calculateAverageAffectedPopulation(int[] affectedPopulation, int count) {
        int sum = 0;
        for (int population : affectedPopulation) {
            sum += population;
        }
        return (double) sum / count;
    }

    // Method to calculate the average displaced population
    public static double calculateAverageDisplacedPopulation(int[] displacedPopulation, int count) {
        int sum = 0;
        for (int population : displacedPopulation) {
            sum += population;
        }
        return (double) sum / count;
    }

    // Method to calculate the average beach erosion
    public static double calculateAverageBeachErosion(int[] beachErosion, int count) {
        int sum = 0;
        for (int erosion : beachErosion) {
            sum += erosion;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate rate of ocean level rise
        System.out.print("Enter maximum current sea level (meters): ");
        double currentLevelMax = scanner.nextDouble();
        System.out.print("Enter minimum past sea level (meters): ");
        double pastLevelMin = scanner.nextDouble();
        System.out.print("Enter maximum year: ");
        int yearMax = scanner.nextInt();
        System.out.print("Enter minimum year: ");
        int yearMin = scanner.nextInt();

        double oceanLevelRise = calculateOceanLevelRise(currentLevelMax, pastLevelMin, yearMax, yearMin);
        System.out.printf("Rate of ocean level rise: %.4f meters/year%n", oceanLevelRise);

        // Calculate average number of floods
        System.out.print("Enter number of years for flood data: ");
        int floodYears = scanner.nextInt();
        int[] floodEvents = new int[floodYears];
        System.out.println("Enter the number of flood events for each year:");
        for (int i = 0; i < floodYears; i++) {
            floodEvents[i] = scanner.nextInt();
        }
        double averageFloods = calculateAverageFloods(floodEvents, floodYears);
        System.out.printf("Average floods per year: %.2f floods/year%n", averageFloods);

        // Calculate average affected population
        System.out.print("Enter number of years for affected population data: ");
        int affectedYears = scanner.nextInt();
        int[] affectedPopulation = new int[affectedYears];
        System.out.println("Enter the affected population for each year:");
        for (int i = 0; i < affectedYears; i++) {
            affectedPopulation[i] = scanner.nextInt();
        }
        double averageAffectedPopulation = calculateAverageAffectedPopulation(affectedPopulation, affectedYears);
        System.out.printf("Average affected population: %.2f people/year%n", averageAffectedPopulation);

        // Calculate average displaced population
        System.out.print("Enter number of years for displaced population data: ");
        int displacedYears = scanner.nextInt();
        int[] displacedPopulation = new int[displacedYears];
        System.out.println("Enter the displaced population for each year:");
        for (int i = 0; i < displacedYears; i++) {
            displacedPopulation[i] = scanner.nextInt();
        }
        double averageDisplacedPopulation = calculateAverageDisplacedPopulation(displacedPopulation, displacedYears);
        System.out.printf("Average displaced population: %.2f people/year%n", averageDisplacedPopulation);

        // Calculate average beach erosion
        System.out.print("Enter number of years for beach erosion data: ");
        int erosionYears = scanner.nextInt();
        int[] beachErosion = new int[erosionYears];
        System.out.println("Enter the beach erosion for each year (in meters):");
        for (int i = 0; i < erosionYears; i++) {
            beachErosion[i] = scanner.nextInt();
        }
        double averageBeachErosion = calculateAverageBeachErosion(beachErosion, erosionYears);
        System.out.printf("Average beach erosion: %.2f meters/year%n", averageBeachErosion);

        scanner.close();
    }
}
تالت مشكله:
        import java.util.Scanner;

public class IceMeltCalculations {

    // Method to calculate average ice melt
    public static double calculateAverageIceMelt(double[] iceVolumes) {
        double sum = 0;
        for (double volume : iceVolumes) {
            sum += volume;
        }
        return sum / iceVolumes.length;
    }

    // Method to calculate the rate of ice melt
    public static double calculateRateOfIceMelt(double[] iceVolumes, int[] years) {
        double maxVolume = iceVolumes[0];
        double minVolume = iceVolumes[0];
        int maxYear = years[0];
        int minYear = years[0];

        for (double volume : iceVolumes) {
            if (volume > maxVolume) {
                maxVolume = volume;
            }
            if (volume < minVolume) {
                minVolume = volume;
            }
        }

        for (int year : years) {
            if (year > maxYear) {
                maxYear = year;
            }
            if (year < minYear) {
                minYear = year;
            }
        }

        return (maxVolume - minVolume) / (maxYear - minYear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of years
        System.out.print("Enter the number of years: ");
        int n = scanner.nextInt();

        double[] iceVolumes = new double[n];
        int[] years = new int[n];

        // Input ice melt volumes and years
        System.out.println("Enter the year and ice volume for each year:");
        for (int i = 0; i < n; i++) {
            System.out.print("Year " + (i + 1) + ": ");
            years[i] = scanner.nextInt();
            System.out.print("Ice volume (in cubic meters): ");
            iceVolumes[i] = scanner.nextDouble();
        }

        // Calculate average ice melt
        double averageIceMelt = calculateAverageIceMelt(iceVolumes);
        System.out.printf("Average ice melt volume: %.2f cubic meters/year%n", averageIceMelt);

        // Calculate rate of ice melt
        double rateOfIceMelt = calculateRateOfIceMelt(iceVolumes, years);
        System.out.printf("Rate of ice melt: %.4f cubic meters/year%n", rateOfIceMelt);

        scanner.close();
    }
}
رابع مشكله:
mport java.util.Scanner;

public class TreeCalculator {
    // حساب المسافة بين الأشجار بناءً على عدد الأشجار المطلوب للفدان
    public static double calculateDistance(double areaInFeddan, int numberOfTrees) {
        // تحويل المساحة من فدان إلى متر مربع (1 فدان = 4200 متر مربع)
        double areaInSquareMeters = areaInFeddan * 4200;
        // حساب المسافة بين الأشجار بناءً على عدد الأشجار المطلوب
        return Math.sqrt(areaInSquareMeters / numberOfTrees);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // إدخال المساحة بعدد الأفدنة
        System.out.print("أدخل المساحة بعدد الأفدنة: ");
        double areaInFeddan = scanner.nextDouble();

        // اختيار نوع الشجر
        System.out.println("اختر نوع الشجر: ");
        System.out.println("1 - أشجار الفاكهة");
        System.out.println("2 - أشجار الغابات");
        System.out.println("3 - أشجار الزينة");
        int treeType = scanner.nextInt();

        // تعيين عدد الأشجار بناءً على نوع الشجر
        int numberOfTrees = 100;  // عدد ثابت لكل فدان
        String treeTypeName = "";

        switch(treeType) {
            case 1:
                treeTypeName = "أشجار الفاكهة";
                break;
            case 2:
                treeTypeName = "أشجار الغابات";
                break;
            case 3:
                treeTypeName = "أشجار الزينة";
                break;
            default:
                System.out.println("اختيار غير صحيح.");
                return;
        }

        // حساب المسافة بين الأشجار
        double treeDistance = calculateDistance(areaInFeddan, numberOfTrees);

        // طباعة النتائج
        System.out.printf("لنوع %s، المساحة المطلوبة لزراعة %d شجرة في كل فدان هي %.2f متر بين الأشجار.\n",
                treeTypeName, numberOfTrees, treeDistance);

        scanner.close();
    }
}
خامس مشكله:
        import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class WeatherChange {
    private int year;
    private double averageTemperature;
    private double totalRainfall;
    private int extremeWeatherEvents;

    public WeatherChange(int year, double averageTemperature, double totalRainfall, int extremeWeatherEvents) {
        this.year = year;
        this.averageTemperature = averageTemperature;
        this.totalRainfall = totalRainfall;
        this.extremeWeatherEvents = extremeWeatherEvents;
    }

    public int getYear() {
        return year;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public double getTotalRainfall() {
        return totalRainfall;
    }

    public int getExtremeWeatherEvents() {
        return extremeWeatherEvents;
    }

    @Override
    public String toString() {
        return "Year: " + year + ", Average Temperature: " + averageTemperature +
                "°C, Total Rainfall: " + totalRainfall + " mm, Extreme Weather Events: " + extremeWeatherEvents;
    }
}

public class WeatherChangesDatabase {
    private List<WeatherChange> weatherChanges;

    public WeatherChangesDatabase() {
        this.weatherChanges = new ArrayList<>();
    }

    public void addWeatherChange(WeatherChange weatherChange) {
        weatherChanges.add(weatherChange);
    }

    public void displayWeatherChanges() {
        System.out.println("Weather Changes Data:");
        for (WeatherChange wc : weatherChanges) {
            System.out.println(wc);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherChangesDatabase db = new WeatherChangesDatabase();

        // Input number of records
        System.out.print("Enter the number of records: ");
        int n = scanner.nextInt();

        // Input weather data for each year
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for record " + (i + 1) + ":");
            System.out.print("Year: ");
            int year = scanner.nextInt();

            System.out.print("Average Temperature (°C): ");
            double averageTemperature = scanner.nextDouble();

            System.out.print("Total Rainfall (mm): ");
            double totalRainfall = scanner.nextDouble();

            System.out.print("Extreme Weather Events: ");
            int extremeWeatherEvents = scanner.nextInt();

            // Create a WeatherChange object and add it to the database
            WeatherChange weatherChange = new WeatherChange(year, averageTemperature, totalRainfall, extremeWeatherEvents);
            db.addWeatherChange(weatherChange);
        }

        // Display all weather changes
        db.displayWeatherChanges();

        scanner.close();
    }
}
سادس مشكله:
        -- إنشاء قاعدة بيانات
CREATE TABLE eco_friendly_camping (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        category TEXT NOT NULL,
        advice TEXT NOT NULL
);

-- إدخال النصائح
INSERT INTO eco_friendly_camping (category, advice) VALUES
('Choosing the Right Site', 'Select a location away from water sources to protect water from pollution.'),
        ('Choosing the Right Site', 'Avoid ecologically sensitive areas, such as those with rare plants or important wildlife habitats.'),
        ('Eco-Friendly Equipment', 'Choose tents made from recyclable or environmentally friendly materials.'),
        ('Eco-Friendly Equipment', 'Use reusable dishes and utensils instead of single-use items.'),
        ('Proper Waste Disposal', 'Bring trash bags to collect waste and store it until you can dispose of it properly.'),
        ('Proper Waste Disposal', 'If you have food scraps, use a compost container for proper disposal.'),
        ('Avoiding Harmful Materials', 'Use natural methods to repel insects, such as essential oils instead of chemical pesticides.'),
        ('Avoiding Harmful Materials', 'Try to minimize plastic use and opt for natural alternatives.'),
        ('Using Renewable Energy', 'Use solar panels to charge electronic devices instead of fuel-powered generators.'),
        ('Using Renewable Energy', 'Opt for LED lights or solar lanterns.'),
        ('Eco-Friendly Cooking', 'If cooking over an open fire, ensure you light it in a safe area away from flammable materials.'),
        ('Eco-Friendly Cooking', 'Choose cooking equipment that requires less fuel and is reusable.'),
        ('Planning', 'Ensure activities you plan do not cause pollution, such as littering or excessive noise.'),
        ('Planning', 'Try to limit the number of participants to reduce environmental impact.'),
        ('Respecting Nature', 'Do not approach or disturb wildlife.'),
        ('Respecting Nature', 'Leave the site as you found it, avoiding leaving any traces.'),
        ('Recycling Resources', 'Try to reuse materials you have instead of buying new ones.');
سابع مشكله:
        import java.util.Scanner;

public class PlantSuggestion {

    // Method to determine the suitable plant based on temperature
    public static String suggestPlant(double temperature) {
        if (temperature >= 30) {
            return "You need to plant heat-tolerant plants such as cactus, tomatoes, or okra.";
        } else if (temperature >= 20 && temperature < 30) {
            return "You need to plant crops such as corn, peppers, or eggplant.";
        } else if (temperature >= 10 && temperature < 20) {
            return "You need to plant vegetables such as potatoes, carrots, or lettuce.";
        } else {
            return "The weather is cold; it's preferable to plant cold-resistant plants such as cabbage or spinach.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the current temperature
        System.out.print("Enter the current temperature (in °C): ");
        double currentTemperature = scanner.nextDouble();

        // Choose the time frame for planting
        System.out.print("Do you want plant suggestions for planting after (1) month or (2) year? (Enter 1 or 2): ");
        int timeFrame = scanner.nextInt();

        // Calculate the expected temperature based on the time frame
        double expectedTemperature = currentTemperature;

        if (timeFrame == 1) {
            expectedTemperature += 2;  // Assume an increase in temperature after a month
        } else if (timeFrame == 2) {
            expectedTemperature += 5;  // Assume an increase in temperature after a year
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        // Suggest plants based on the expected temperature
        String plantSuggestion = suggestPlant(expectedTemperature);

        // Print the suggestion
        System.out.printf("For the expected temperature of %.2f °C, %s\n", expectedTemperature, plantSuggestion);

        scanner.close();
    }
}



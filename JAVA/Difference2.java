import java.text.NumberFormat;

public class WorldPopulationProjection {
    public static void main(String[] args) {

        long currentPopulation = 8_240_437_918L; 
        double annualGrowthRate = 0.0085;

        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(true);

        System.out.println("Year\tProjected population\tIncrease that year");
        long population = currentPopulation;
        long doubleTarget = currentPopulation * 2;
        Integer yearDouble = null;

        for (int year = 1; year <= 75; year++) {
            long increase = Math.round(population * annualGrowthRate);
            population += increase;

            System.out.println(year + "\t" + nf.format(population) + "\t\t" + nf.format(increase));

            if (yearDouble == null && population >= doubleTarget) {
                yearDouble = year;
            }
        }

        if (yearDouble != null) {
            System.out.println("\nPopulation would double current size by year " + yearDouble +
                               " (i.e., in " + yearDouble + " years at " + (annualGrowthRate * 100) + "%).");
        } else {
            System.out.println("\nPopulation does not double within 75 years at " +
                               (annualGrowthRate * 100) + "%.");
        }
    }
}

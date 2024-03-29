public class PyrithioneMain {
    public static void main(String[] args){

        double scale_99 = 2.71760274, sigma_99 = 0.56002833;
        double scale_98 = 2.54669037, sigma_98 = 0.66599239;
        double scale_97 = 2.37276256, sigma_97 = 0.76486794;
        double scale_96 = 2.17434104, sigma_96 = 0.87159677;
        double scale_95 = 1.9246899, sigma_95 = 1.00179994;
        double scale_94 = 1.54590048, sigma_94 = 1.20080013;
        double scale_93 = 1.01073016, sigma_93 = 1.51389233;
        double scale_90 = 1.01115312, sigma_90 = 1.51378016;

        String date = "-20-December-2019";
        String folderID99 = "-99_suscep"+date;
        String folderID98 = "-98_suscep"+date;
        String folderID97 = "-97_suscep"+date;
        String folderID96 = "-96_suscep"+date;
        String folderID95 = "-95_suscep"+date;
        String folderID94 = "-94_suscep"+date;
        String folderID93 = "-93_suscep"+date;
        String folderID90 = "-90_suscep"+date;
        String folderID_testing = "-99-test-steadystate";

        int nReps = 1000;
        System.out.println("failure time routine");
        BioSystem.timeToFailure(nReps, scale_99, sigma_99, folderID99);
        //BioSystem.getEventCountersAndRunPopulations(nReps, scale_99, sigma_99, folderID99);
    }
}

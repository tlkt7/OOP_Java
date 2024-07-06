public class Main {
    public static void main(String[] args) {

        ToshibaBattery[] toshibaBatteries = new ToshibaBattery[5];
        toshibaBatteries[0] = new ToshibaBattery(3.0, 2.0, 6000, 500);
        toshibaBatteries[1] = new ToshibaBattery(3.1, 2.1, 6100, 500);
        toshibaBatteries[2] = new ToshibaBattery(3.2, 2.2, 6200, 500);
        toshibaBatteries[3] = new ToshibaBattery(3.3, 2.3, 6300, 500);
        toshibaBatteries[4] = new ToshibaBattery(3.4, 2.4, 6400, 500);


        DuracellBattery[] duracellBatteries = new DuracellBattery[5];
        duracellBatteries[0] = new DuracellBattery(3.0, 2.0, 6000, 1.0);
        duracellBatteries[1] = new DuracellBattery(3.1, 2.1, 6100, 1.1);
        duracellBatteries[2] = new DuracellBattery(3.2, 2.2, 6200, 1.2);
        duracellBatteries[3] = new DuracellBattery(3.3, 2.3, 6300, 1.3);
        duracellBatteries[4] = new DuracellBattery(3.4, 2.4, 6400, 1.4);


        FlashLight[] flashLights = new FlashLight[5];
        flashLights[0] = new FlashLight(new Battery[]{toshibaBatteries[0], duracellBatteries[0]});
        flashLights[1] = new FlashLight(new Battery[]{toshibaBatteries[1], duracellBatteries[1]});
        flashLights[2] = new FlashLight(new Battery[]{toshibaBatteries[2], duracellBatteries[2]});
        flashLights[3] = new FlashLight(new Battery[]{toshibaBatteries[3], duracellBatteries[3]});
        flashLights[4] = new FlashLight(new Battery[]{toshibaBatteries[4], duracellBatteries[4]});


        for (int i = 0; i < flashLights.length; i++) {
            System.out.println("Flashlight " + (i + 1) + " lifetime: " + flashLights[i].getTotalLifeTime() + " seconds");
        }


        FlashLight maxLifeFlashlight = flashLights[0];
        for (int i = 1; i < flashLights.length; i++) {
            if (flashLights[i].getTotalLifeTime() > maxLifeFlashlight.getTotalLifeTime()) {
                maxLifeFlashlight = flashLights[i];
            }
        }
        System.out.println("Flashlight with maximum lifetime: " + maxLifeFlashlight.getTotalLifeTime() + " seconds");
    }
}


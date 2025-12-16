package com.jerry.mekmm.common.integration.computer;

import mekanism.common.capabilities.energy.MachineEnergyContainer;
import mekanism.common.integration.computer.SpecialComputerMethodWrapper;
import mekanism.common.integration.computer.annotation.WrappingComputerMethod;

public class ComputerEnergyContainerWrapper extends SpecialComputerMethodWrapper {

    @WrappingComputerMethod.WrappingComputerMethodIndex(0)
    @WrappingComputerMethod.WrappingComputerMethodHelp("Get the stored of the %s.")
    public static long getEnergy(MachineEnergyContainer<?> container) {
        return container.getEnergy();
    }

    @WrappingComputerMethod.WrappingComputerMethodIndex(1)
    @WrappingComputerMethod.WrappingComputerMethodHelp("Get the capacity of the %s.")
    public static long getCapacity(MachineEnergyContainer<?> container) {
        return container.getMaxEnergy();
    }

    @WrappingComputerMethod.WrappingComputerMethodIndex(2)
    @WrappingComputerMethod.WrappingComputerMethodHelp("Get the amount needed to fill the %s.")
    public static long getNeeded(MachineEnergyContainer<?> container) {
        return container.getNeeded();
    }

    @WrappingComputerMethod.WrappingComputerMethodIndex(3)
    @WrappingComputerMethod.WrappingComputerMethodHelp("Get the filled percentage of the %s.")
    public static double getFilledPercentage(MachineEnergyContainer<?> container) {
        return container.getEnergy() / (double) container.getMaxEnergy();
    }
}

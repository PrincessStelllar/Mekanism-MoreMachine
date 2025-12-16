package com.jerry.mekmm.common.tile.factory;

import mekanism.api.chemical.ChemicalStack;
import mekanism.common.integration.computer.BaseComputerHelper;
import mekanism.common.integration.computer.ComputerException;
import mekanism.common.integration.computer.ComputerMethodFactory;
import mekanism.common.integration.computer.MethodData;
import mekanism.common.integration.computer.SpecialComputerMethodWrapper.ComputerChemicalTankWrapper;
import mekanism.common.integration.computer.SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityPlantingFactory.class)
public class TileEntityPlantingFactory$ComputerHandler extends ComputerMethodFactory<TileEntityPlantingFactory> {

    private final String[] NAMES_process = new String[] { "process" };

    private final Class[] TYPES_int = new Class[] { int.class };

    public TileEntityPlantingFactory$ComputerHandler() {
        register(MethodData.builder("getSecondaryOutput", TileEntityPlantingFactory$ComputerHandler::getSecondaryOutput_1).returnType(ItemStack.class).arguments(NAMES_process, TYPES_int));
        register(MethodData.builder("getChemicalItem", TileEntityPlantingFactory$ComputerHandler::extraSlot$getChemicalItem).returnType(ItemStack.class).methodDescription("Get the contents of the chemical item slot."));
        register(MethodData.builder("getChemical", TileEntityPlantingFactory$ComputerHandler::chemicalTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the chemical tank."));
        register(MethodData.builder("getChemicalCapacity", TileEntityPlantingFactory$ComputerHandler::chemicalTank$getChemicalCapacity).returnType(long.class).methodDescription("Get the capacity of the chemical tank."));
        register(MethodData.builder("getChemicalNeeded", TileEntityPlantingFactory$ComputerHandler::chemicalTank$getChemicalNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the chemical tank."));
        register(MethodData.builder("getChemicalFilledPercentage", TileEntityPlantingFactory$ComputerHandler::chemicalTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the chemical tank."));
        register(MethodData.builder("dumpChemical", TileEntityPlantingFactory$ComputerHandler::dumpChemical_0).methodDescription("Empty the contents of the chemical tank into the environment").requiresPublicSecurity());
    }

    public static Object getSecondaryOutput_1(TileEntityPlantingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(subject.getSecondaryOutput(helper.getInt(0)));
    }

    public static Object extraSlot$getChemicalItem(TileEntityPlantingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerIInventorySlotWrapper.getStack(subject.chemicalSlot));
    }

    public static Object chemicalTank$getChemical(TileEntityPlantingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerChemicalTankWrapper.getStack(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalCapacity(TileEntityPlantingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerChemicalTankWrapper.getCapacity(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalNeeded(TileEntityPlantingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerChemicalTankWrapper.getNeeded(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalFilledPercentage(TileEntityPlantingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerChemicalTankWrapper.getFilledPercentage(subject.chemicalTank));
    }

    public static Object dumpChemical_0(TileEntityPlantingFactory subject, BaseComputerHelper helper) throws ComputerException {
        subject.dumpChemical();
        return helper.voidResult();
    }
}

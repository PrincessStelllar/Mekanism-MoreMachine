package com.jerry.mekmm.common.tile.machine;

import mekanism.api.chemical.ChemicalStack;
import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityPlantingStation.class)
public class TileEntityPlantingStation$ComputerHandler extends ComputerMethodFactory<TileEntityPlantingStation> {

    public TileEntityPlantingStation$ComputerHandler() {
        register(MethodData.builder("getInput", TileEntityPlantingStation$ComputerHandler::inputSlot$getInput).returnType(ItemStack.class).methodDescription("Get the contents of the input slot."));
        register(MethodData.builder("getChemical", TileEntityPlantingStation$ComputerHandler::chemicalTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the chemical tank."));
        register(MethodData.builder("getChemicalCapacity", TileEntityPlantingStation$ComputerHandler::chemicalTank$getChemicalCapacity).returnType(long.class).methodDescription("Get the capacity of the chemical tank."));
        register(MethodData.builder("getChemicalNeeded", TileEntityPlantingStation$ComputerHandler::chemicalTank$getChemicalNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the chemical tank."));
        register(MethodData.builder("getChemicalFilledPercentage", TileEntityPlantingStation$ComputerHandler::chemicalTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the chemical tank."));
        register(MethodData.builder("getOutput", TileEntityPlantingStation$ComputerHandler::outputSlot$getOutput).returnType(ItemStack.class).methodDescription("Get the contents of the output slot."));
        register(MethodData.builder("getSecondaryOutput", TileEntityPlantingStation$ComputerHandler::secondaryOutputSlot$getSecondaryOutput).returnType(ItemStack.class).methodDescription("Get the contents of the secondary output slot."));
        register(MethodData.builder("getChemicalItem", TileEntityPlantingStation$ComputerHandler::chemicalSlot$getChemicalItem).returnType(ItemStack.class).methodDescription("Get the contents of the chemical input slot."));
        register(MethodData.builder("getEnergyItem", TileEntityPlantingStation$ComputerHandler::energySlot$getEnergyItem).returnType(ItemStack.class).methodDescription("Get the contents of the energy slot."));
        register(MethodData.builder("getEnergyUsage", TileEntityPlantingStation$ComputerHandler::getEnergyUsage_0).returnType(long.class).methodDescription("Get the energy used in the last tick by the machine"));
    }

    public static Object inputSlot$getInput(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.inputSlot));
    }

    public static Object chemicalTank$getChemical(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getStack(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalCapacity(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getCapacity(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalNeeded(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getNeeded(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalFilledPercentage(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getFilledPercentage(subject.chemicalTank));
    }

    public static Object outputSlot$getOutput(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.mainOutputSlot));
    }

    public static Object secondaryOutputSlot$getSecondaryOutput(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.secondaryOutputSlot));
    }

    public static Object chemicalSlot$getChemicalItem(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.chemicalSlot));
    }

    public static Object energySlot$getEnergyItem(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.energySlot));
    }

    public static Object getEnergyUsage_0(TileEntityPlantingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(subject.getEnergyUsage());
    }
}

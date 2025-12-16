package com.jerry.mekmm.common.tile.factory;

import mekanism.api.chemical.ChemicalStack;
import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityReplicatingFactory.class)
public class TileEntityReplicatingFactory$ComputerHandler extends ComputerMethodFactory<TileEntityReplicatingFactory> {

    public TileEntityReplicatingFactory$ComputerHandler() {
        register(MethodData.builder("getChemicalItem", TileEntityReplicatingFactory$ComputerHandler::extraSlot$getChemicalItem).returnType(ItemStack.class).methodDescription("Get the contents of the chemical item slot."));
        register(MethodData.builder("getChemical", TileEntityReplicatingFactory$ComputerHandler::chemicalTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the chemical tank."));
        register(MethodData.builder("getChemicalCapacity", TileEntityReplicatingFactory$ComputerHandler::chemicalTank$getChemicalCapacity).returnType(long.class).methodDescription("Get the capacity of the chemical tank."));
        register(MethodData.builder("getChemicalNeeded", TileEntityReplicatingFactory$ComputerHandler::chemicalTank$getChemicalNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the chemical tank."));
        register(MethodData.builder("getChemicalFilledPercentage", TileEntityReplicatingFactory$ComputerHandler::chemicalTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the chemical tank."));
        register(MethodData.builder("dumpChemical", TileEntityReplicatingFactory$ComputerHandler::dumpChemical_0).methodDescription("Empty the contents of the chemical tank into the environment").requiresPublicSecurity());
    }

    public static Object extraSlot$getChemicalItem(TileEntityReplicatingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.chemicalSlot));
    }

    public static Object chemicalTank$getChemical(TileEntityReplicatingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getStack(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalCapacity(TileEntityReplicatingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getCapacity(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalNeeded(TileEntityReplicatingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getNeeded(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalFilledPercentage(TileEntityReplicatingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getFilledPercentage(subject.chemicalTank));
    }

    public static Object dumpChemical_0(TileEntityReplicatingFactory subject, BaseComputerHelper helper) throws ComputerException {
        subject.dumpChemical();
        return helper.voidResult();
    }
}

package com.designpatterns.zemoso.builder;

class HutBuilder implements HouseBuilder
{
    private House house;

    public HutBuilder()
    {
        this.house = new House();
    }

    public void buildBasement()
    {
        house.setBasement("Soil");
    }

    public void buildStructure()
    {
        house.setStructure("Wood");
    }

    public void buildInterior()
    {
        house.setInterior("Mud");
    }

    public void buildRoof()
    {
        house.setRoof("Wood, Grass");
    }

    public House getHouse()
    {
        return this.house;
    }
}
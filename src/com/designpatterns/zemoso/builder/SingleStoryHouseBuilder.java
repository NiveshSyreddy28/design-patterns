package com.designpatterns.zemoso.builder;

class SingleStoryHouseBuilder implements HouseBuilder
{
    private House house;

    public SingleStoryHouseBuilder()
    {
        this.house = new House();
    }

    public void buildBasement()
    {
        house.setBasement("Marble");
    }

    public void buildStructure()
    {
        house.setStructure("Concrete pillars");
    }

    public void buildInterior()
    {
        house.setInterior("Brick walls");
    }

    public void buildRoof()
    {
        house.setRoof("concrete roof, Fall ceiling");
    }

    public House getHouse()
    {
        return this.house;
    }

}

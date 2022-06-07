package com.designpatterns.zemoso.builder;

class Builder
{
    public static void main(String[] args)
    {
        HouseBuilder HutBuilder = new HutBuilder();
        CivilEngineer engineer = new CivilEngineer(HutBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
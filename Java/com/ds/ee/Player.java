package com.ds.ee;

class Player {

    private String name;
    private int hp;
    private int maxHP;

    public Player(String name, int maxHP){
        this.name = name;
        this.maxHP = maxHP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
}

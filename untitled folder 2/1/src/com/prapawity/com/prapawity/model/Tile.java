package com.prapawity.com.prapawity.model;

public class Tile {
    private TERRAIN terrain;
    private Actor actor;

    public Tile(TERRAIN terrain) {
        this.terrain = terrain;
    }

    public TERRAIN getTerrain() {
        return terrain;
    }

    public void setTerrain(TERRAIN terrain) {
        this.terrain = terrain;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
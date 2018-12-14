package com.mygdx.game;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.mygdx.game.entitirs.ShowImage;

public class BagRender {
    public void render(ShowImage[] weedList, OrthogonalTiledMapRenderer renderer, Camera camera){
        weedList[0].setPosition(camera.position.x+25,camera.position.y-327);
        weedList[1].setPosition(camera.position.x+90,camera.position.y-327);
        weedList[2].setPosition(camera.position.x+200,camera.position.y-327);
        weedList[3].setPosition(camera.position.x+285,camera.position.y-327);
        weedList[0].draw(renderer.getBatch());
        weedList[1].draw(renderer.getBatch());
        weedList[2].draw(renderer.getBatch());
        weedList[3].draw(renderer.getBatch());

    }
}
package com.brostagma.mechanics;

import com.brostagma.main.Game;
import com.brostagma.main.GameLogs;
import com.brostagma.scene.GameScene;

public class AppleMechanics extends GameScene implements MechanicsMethod {

    private final Game game;

    protected String clickText;
    protected String autoText;
    protected String clickLevelText;

    protected int limit;
    protected long lastTimeCheck;

    public AppleMechanics(Game game) {
        super(game);
        this.game = game;
        initCore();
        this.run();
    }

    protected void initCore() {
        clickText = "Make Cookie: ";
        autoText = "Buy Make Auto Cookie " + GameLogs.autoLevel;
        clickLevelText = "Buy Click Level " + GameLogs.clickLevel;
        limit = 1000;
        lastTimeCheck = System.currentTimeMillis();
    }

    protected boolean checkAutoCookieValue() {
        return GameLogs.cookieCount >= GameLogs.autoCookieValue;
    }

    protected boolean checkClickLevelValue() {
        return GameLogs.cookieCount >= GameLogs.clickLevelValue;
    }

    protected void autoCookie() {
        if (GameLogs.isAuto) {
            GameLogs.cookieCount += GameLogs.autoLevel;
        }
    }

    protected void mechanicUpdate() {
        if (game.oneSecond(lastTimeCheck, limit)) {
            lastTimeCheck = System.currentTimeMillis();
            autoCookie();
        }
    }

    protected void buyClickLevel() {
        GameLogs.cookieCount -= GameLogs.clickLevelValue;
        GameLogs.clickLevel++;
        GameLogs.clickLevelValue = 30 * GameLogs.clickLevel;
        clickLevelText = "Buy Click Level " + GameLogs.clickLevel;
    }

    protected void buyAutoLevel() {
        GameLogs.cookieCount -= GameLogs.autoCookieValue;
        GameLogs.isAuto = true;
        GameLogs.autoLevel++;
        GameLogs.autoCookieValue = 60 * GameLogs.autoLevel;
        limit -= 10;
        autoText = "Buy Make Auto Cookie " + GameLogs.autoLevel;
    }

    @Override
    public void run() {
//        while (true) {
//        System.out.println("testWork");
//            //Game Update ba??l?? d??ng?? olu??turulacak her level??n kendi implements etti??i interface den ald?????? Runnable s??n??f?? ile --
//            //kendi i??erisinde ki mekanikleri organizde edip d??nd??recek ba??ka levellara ge??ildi??inde di??er levelda bulunan auto methodu ??al????acak.
//            //YEN?? NOT! while d??ng??s?? runnable ile ??al????t?????? i??in d??ng??den ????kam??yor ve birden fazla i??lem g??c??n?? ??stlenemiyor kullanam??yor.
//            //??ok i??lemci sayesinde ui tasar??m??n??n g??sterilmesi laz??m hata sebebi while d??ng??s?? girdi??i gibi t??m i??lemleri ask??ya al??yor.
//            //Problem Runnable ya da thread'dan kaynakl?? de??il direkt olarak while d??ng??s?? i??lemleri k??s??tlayarak program?? ??ld??r??yor.
//            //Thread & Runnable kullan??m??n?? daha da stabil ve ??al????abilir hale getirerek problem ????z??lebilir.
//        }
    }

    @Override
    public void update() {

    }

    @Override
    public void progress() {

    }
}

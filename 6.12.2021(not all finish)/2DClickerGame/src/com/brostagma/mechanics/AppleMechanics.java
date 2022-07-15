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
//            //Game Update bağlı döngü oluşturulacak her levelın kendi implements ettiği interface den aldığı Runnable sınıfı ile --
//            //kendi içerisinde ki mekanikleri organizde edip döndürecek başka levellara geçildiğinde diğer levelda bulunan auto methodu çalışacak.
//            //YENİ NOT! while döngüsü runnable ile çalıştığı için döngüden çıkamıyor ve birden fazla işlem gücünü üstlenemiyor kullanamıyor.
//            //çok işlemci sayesinde ui tasarımının gösterilmesi lazım hata sebebi while döngüsü girdiği gibi tüm işlemleri askıya alıyor.
//            //Problem Runnable ya da thread'dan kaynaklı değil direkt olarak while döngüsü işlemleri kısıtlayarak programı öldürüyor.
//            //Thread & Runnable kullanımını daha da stabil ve çalışabilir hale getirerek problem çözülebilir.
//        }
    }

    @Override
    public void update() {

    }

    @Override
    public void progress() {

    }
}

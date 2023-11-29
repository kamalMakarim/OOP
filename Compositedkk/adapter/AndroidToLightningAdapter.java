package Compositedkk.adapter;

class AndroidToLightningAdapter implements LightningConnector {
    private AndroidCharger androidCharger;

    public AndroidToLightningAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeWithLightning() {
        androidCharger.chargeWithUSBC();
    }
}
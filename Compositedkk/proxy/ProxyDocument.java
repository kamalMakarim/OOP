package Compositedkk.proxy;

class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String content;

    public ProxyDocument(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(content);
        }
        realDocument.display();
    }
}

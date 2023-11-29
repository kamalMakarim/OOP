package Compositedkk.proxy;

class RealDocument implements Document {
    private String content;

    public RealDocument(String content) {
        this.content = content;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading document");
    }

    @Override
    public void display() {
        System.out.println("Displaying document: " + content);
    }
}


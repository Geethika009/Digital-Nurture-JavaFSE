class PdfDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening PDF document: " + content);
    }
    @Override
    public void save() {
        System.out.println("Saving PDF document: " + content);
    }
}
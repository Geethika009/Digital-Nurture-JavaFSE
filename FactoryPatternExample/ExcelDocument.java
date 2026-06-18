class ExcelDoocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Excel document: " + content);
    }
    @Override
    public void save() {
        System.out.println("Saving Excel document: " + content);
    }
}
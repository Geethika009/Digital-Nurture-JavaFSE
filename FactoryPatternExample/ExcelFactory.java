class ExcelFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new ExcelDoocument();
    }
}
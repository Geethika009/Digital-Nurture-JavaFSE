class test{
    public static void main(String[] args){
        //testing word document
        DocumentFactory wordFactory = new WordFactory(); // constructor is called with concrete class name of the factory
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
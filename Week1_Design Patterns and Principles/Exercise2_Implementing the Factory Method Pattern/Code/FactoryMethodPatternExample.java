public class FactoryMethodPatternExample{
    public static void main(String[] args){
        DocumentFactory WordDocFactory=new WordDocumentFactory();
        Document WordDoc=WordDocFactory.createDocument();
        WordDoc.open();

        DocumentFactory ExcelDocFactory=new ExcelDocumentFactory();
        Document ExcelDoc=ExcelDocFactory.createDocument();
        ExcelDoc.open();

        DocumentFactory PdfDocFactory=new PdfDocumentFactory();
        Document PdfDoc=PdfDocFactory.createDocument();
        PdfDoc.open();

        DocumentFactory JpegDocFactory=new JpegDocumentFactory();
        Document JpegDoc=JpegDocFactory.createDocument();
        JpegDoc.open();
    }
    
}
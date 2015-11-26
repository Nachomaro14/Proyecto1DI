package controlador;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import modelo.Modelo;

public class PDF {

    Modelo consultas = new Modelo();

    public void generarFacturaPDF() throws FileNotFoundException, DocumentException {
        Document documento = new Document();
        FileOutputStream fos = new FileOutputStream("Factura.pdf");
        PdfPTable tablaEmpresa, tablaPedidos, tablaArticuloPedido;

        consultas.tablaArticulosPedidos(null);

        PdfWriter.getInstance(documento, fos).setInitialLeading(20);

        documento.open();
        //Creamos las tablas
        tablaEmpresa = new PdfPTable(5);
        tablaPedidos = new PdfPTable(5);
        tablaArticuloPedido = new PdfPTable(4);

        documento.add(new Paragraph("AQUI EL CLIENTE"));
        documento.add(new Paragraph());

    }

    public void generarProformaPDF() {

    }
}

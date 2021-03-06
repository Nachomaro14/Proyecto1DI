package controlador;

import clases.ArtPedidos;
import clases.ArtPresupuestos;
import clases.Clientes;
import clases.Empresa;
import clases.Pedidos;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import modelo.ModeloPdf;

public class PDF {

    ModeloPdf datos = new ModeloPdf();

    ArrayList<Clientes> clienteList = datos.recogeClientes();
    ArrayList<Empresa> empresaList = datos.recogeEmpresa();
    ArrayList<Pedidos> pedidosList = datos.recogePedidos();
    ArrayList<ArtPedidos> artiPedidoList = datos.recogerArtiPedidos();
    ArrayList<ArtPresupuestos> artiPresuList = datos.recogerArtiPresupuesto();

    Document documento;
    FileOutputStream fos;

    public void generarFacturaPDF(String codPedido, String fchPedido, String[] cliente) throws FileNotFoundException, DocumentException {
        documento = new Document();
        fos = new FileOutputStream(cliente[1] + "Factura.pdf");
        PdfPTable tablaArticuloPedido;

        PdfWriter.getInstance(documento, fos).setInitialLeading(30);

        documento.open();

        Paragraph cabecera = new Paragraph();
        cabecera.add("Factura del pedido");
        cabecera.setAlignment(Element.ALIGN_CENTER);
        documento.add(cabecera);

        Paragraph clientex = new Paragraph();
        clientex.add("Cliente: " + cliente[1] + " " + cliente[2]);
        clientex.add("Domicilio: " + cliente[3]);
        clientex.add("Correo: " + cliente[5]);
        documento.add(clientex);

        documento.add(new Paragraph("Codigo del pedido: " + codPedido));
        documento.add(new Paragraph("Fecha: " + fchPedido));

        documento.add(new Paragraph(""));
        tablaArticuloPedido = new PdfPTable(4);
        tablaArticuloPedido.addCell("Codigo Articulo");
        tablaArticuloPedido.addCell("Nombre");
        tablaArticuloPedido.addCell("Precio");
        tablaArticuloPedido.addCell("Cantidad");
        for (ArtPedidos ape : artiPedidoList) {
            tablaArticuloPedido.addCell(String.valueOf(ape.getCodigoArticulo()));
            tablaArticuloPedido.addCell(ape.getNombre());
            tablaArticuloPedido.addCell(String.valueOf(ape.getPrecio()));
            tablaArticuloPedido.addCell(String.valueOf(ape.getCantidad()));
        }
        documento.add(tablaArticuloPedido);

        documento.close();

    }

    public void generarProformaPDF() throws FileNotFoundException, DocumentException {
        documento = new Document();
        fos = new FileOutputStream("Proforma.pdf");
        PdfPTable tablaArticuloPresupuesto;

        PdfWriter.getInstance(documento, fos).setInitialLeading(20);

        documento.open();
        //Creamos las tablas

        tablaArticuloPresupuesto = new PdfPTable(4);
        tablaArticuloPresupuesto.addCell("Codigo Articulo");
        tablaArticuloPresupuesto.addCell("Nombre");
        tablaArticuloPresupuesto.addCell("Precio");
        tablaArticuloPresupuesto.addCell("Cantidad");
        for (ArtPresupuestos apre : artiPresuList) {
            tablaArticuloPresupuesto.addCell(String.valueOf(apre.getCodigoArticulo()));
            tablaArticuloPresupuesto.addCell(apre.getNombre());
            tablaArticuloPresupuesto.addCell(String.valueOf(apre.getPrecio()));
            tablaArticuloPresupuesto.addCell(String.valueOf(apre.getCantidad()));
        }
        documento.add(tablaArticuloPresupuesto);
    }
}

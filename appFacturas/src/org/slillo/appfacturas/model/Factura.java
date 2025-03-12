package org.slillo.appfacturas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int idFactura;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoId;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.idFactura = ++ultimoId;
        this.fecha = new Date();
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if(indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;

        for(int i = 0; i < this.indiceItems; i++) {
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº ");
        sb.append(this.idFactura)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM , yyyy");
        sb.append("Fecha emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t€\tCant.\tTotal\n");

        for(int i = 0; i < indiceItems; i++) {
            sb.append(this.items[i].toString()).append("\n");
        }

        sb.append("Total: ")
                .append(this.calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return this.generarDetalle();
    }
}

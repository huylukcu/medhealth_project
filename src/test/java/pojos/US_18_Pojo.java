package pojos;

public class US_18_Pojo {
    private String name;
    private String descripe;
    private Double price;

    public US_18_Pojo(String name, String descripe, Double price) {
        this.name = name;
        this.descripe = descripe;
        this.price = price;

    }
    public US_18_Pojo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "US_18_Pojo{" +
                "name='" + name + '\'' +
                ", descripe='" + descripe + '\'' +
                ", price=" + price +
                '}';
    }
}


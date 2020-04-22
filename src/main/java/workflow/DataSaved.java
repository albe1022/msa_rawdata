package workflow;

public class DataSaved extends AbstractEvent {

    private Long id;
    private String dataType;

    public DataSaved(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}

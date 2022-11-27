public class Rent {
    private String id;
    private String NCL;
    private String DdL;
    private String DfL;

public Rent(String id,String NC,String DdL,String DfL){
  this.id= id;
  this.NCL= NCL;
  this.DdL= DdL;
  this.DfL= DfL;

}
//id
public String getId(){
    return this.id;
}
public void setId(String id){
    this.id= id;
}
//nclient
public String getNcl(){
    return this.NCL;
}
public void setNcl(String NCL){
    this.NCL= NCL;
}
//nclient
public String getDdl(){
    return this.DdL;
}
public void setDdl(String DdL){
    this.DdL= DdL;
}
//nclient
public String getDfl(){
    return this.DdL;
}
public void setDfl(String DfL){
    this.DfL= DfL;
}


}
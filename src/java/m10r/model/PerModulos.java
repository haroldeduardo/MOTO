package m10r.model;
// Generated Jun 27, 2018 9:14:37 PM by Hibernate Tools 4.3.1



/**
 * PerModulos generated by hbm2java
 */
public class PerModulos  implements java.io.Serializable {


     private Integer idPerModulos;
     private int perfilesIdPerfiles;
     private int modulosIdModulos;

    public PerModulos() {
    }

    public PerModulos(int perfilesIdPerfiles, int modulosIdModulos) {
       this.perfilesIdPerfiles = perfilesIdPerfiles;
       this.modulosIdModulos = modulosIdModulos;
    }
   
    public Integer getIdPerModulos() {
        return this.idPerModulos;
    }
    
    public void setIdPerModulos(Integer idPerModulos) {
        this.idPerModulos = idPerModulos;
    }
    public int getPerfilesIdPerfiles() {
        return this.perfilesIdPerfiles;
    }
    
    public void setPerfilesIdPerfiles(int perfilesIdPerfiles) {
        this.perfilesIdPerfiles = perfilesIdPerfiles;
    }
    public int getModulosIdModulos() {
        return this.modulosIdModulos;
    }
    
    public void setModulosIdModulos(int modulosIdModulos) {
        this.modulosIdModulos = modulosIdModulos;
    }




}



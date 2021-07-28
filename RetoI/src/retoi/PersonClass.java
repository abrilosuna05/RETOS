/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoi;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Daniela Abril 
 */
public class PersonClass {
    private String Name;
    private String DocumentType;
    private int DocumentNumber;
    private char Gender;
    private int BornDate;
    private double Weight;
    private double Height;
    private String BirthDepartment;
    private String BirthCity;
    private String Address;
    private String Mobile;
    private String Profession;
    private String CivilStatus;
    private boolean Disability;
    private boolean CurrentlyStudying;
    private boolean Children;
    private int ChildrenNumber;
    private String Live;
    private String MotherName;
    private String FatherName;

    public PersonClass( String Name, String DocumentType, int DocumentNumber, char Gender, int BornDate, double Weight, double Height, String BirthDepartment, String BirthCity, String Address, String Mobile, String Profession, String CivilStatus, boolean Disability, boolean CurrentlyStudying, boolean Children, String Live, String MotherName, String FatherName) {
        this.Name = Name;
        this.DocumentType = DocumentType;
        this.DocumentNumber = DocumentNumber;
        this.Gender = Gender;
        this.BornDate = BornDate;
        this.Weight = Weight;
        this.Height = Height;
        this.BirthDepartment = BirthDepartment;
        this.BirthCity = BirthCity;
        this.Address = Address;
        this.Mobile = Mobile;
        this.Profession = Profession;
        this.CivilStatus = CivilStatus;
        this.Disability = Disability;
        this.CurrentlyStudying = CurrentlyStudying;
        this.Children = Children;
        this.Live = Live;
        this.MotherName = MotherName;
        this.FatherName = FatherName;
    }
    
    public void Talk(){
        System.out.println("     >>" + this.Name + " está hablando.");
    }
    
    public void Eat(){
        System.out.println("     >>" + this.Name + " está comiendo.");
    }
    
    public void Work(){
        System.out.println("     >>" + this.Name + " está trabajando.");
    }
    
    public void Walk(){
        System.out.println("     >>" + this.Name + " está caminando.");
    }
    
    public void Breathe(){
        System.out.println("     >>" + this.Name + " está respirando.");
    }
    
    public void Read(){
        System.out.println("     >>" + this.Name + " está leyendo.");
    }
    
    public void MotherCall(){
        System.out.println("     >>" + this.Name + " está llamando a su mamá " + this.MotherName + ".");
    }
    
    public void FatherCall(){
        System.out.println("     >>" + this.Name + " está llamando a su papá " + this.FatherName + ".");
    }
    
    public void Call(){
        System.out.println("     >>" + this.Name + " está llamando.");
    }
    
    public void Sleep(){
        System.out.println("     >>" + this.Name + " está durmiendo");
    }
    
    public void Run(){
        System.out.println("     >>" + this.Name + " está corriendo.");
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDocumentType() {
        return DocumentType;
    }

    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    public int getDocumentNumber() {
        return DocumentNumber;
    }

    public void setDocumentNumber(int DocumentNumber) {
        this.DocumentNumber = DocumentNumber;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public int getBornDate() {
        return BornDate;
    }

    public void setBornDate(int BornDate) {
        this.BornDate = BornDate;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public String getBirthDepartment() {
        return BirthDepartment;
    }

    public void setBirthDepartment(String BirthDepartment) {
        this.BirthDepartment = BirthDepartment;
    }

    public String getBirthCity() {
        return BirthCity;
    }

    public void setBirthCity(String BirthCity) {
        this.BirthCity = BirthCity;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    public String getCivilStatus() {
        return CivilStatus;
    }

    public void setCivilStatus(String CivilStatus) {
        this.CivilStatus = CivilStatus;
    }

    public boolean isDisability() {
        return Disability;
    }

    public void setDisability(boolean Disability) {
        this.Disability = Disability;
    }

    public boolean isCurrentlyStudying() {
        return CurrentlyStudying;
    }

    public void setCurrentlyStudying(boolean CurrentlyStudying) {
        this.CurrentlyStudying = CurrentlyStudying;
    }

    public boolean isChildren() {
        return Children;
    }

    public void setChildren(boolean Children) {
        this.Children = Children;
    }

    public int getChildrenNumber() {
        return ChildrenNumber;
    }

    public void setChildrenNumber(int ChildrenNumber) {
        this.ChildrenNumber = ChildrenNumber;
    }

    public String getLive() {
        return Live;
    }

    public void setLive(String Live) {
        this.Live = Live;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String MotherName) {
        this.MotherName = MotherName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String FatherName) {
        this.FatherName = FatherName;
    }
    
    public String information1(){
        String Genero;
        if (getGender() == 'M'){
            Genero = "Masculino";
        }else{
            Genero = "Femenino";
        }
       
   return Genero;
              
    }
    public int Age(){
       
       Calendar ActualYear = Calendar.getInstance();
       int Year = ActualYear.get(Calendar.YEAR);
       
       int AgePerson = Year - getBornDate();
       
    return AgePerson;
    }
    public String information2 (){
        String Discapacidad;
        if (isDisability() == true){
            Discapacidad = "Se encuentra en condición de discapacidad.";
        }else{
            Discapacidad = "No se encuentra en condición de discapacidad.";
        }
    return Discapacidad;
    }
    public String information3 (){
        String Study;
        if (isCurrentlyStudying() == true){
            Study = "Se encuentra estudiando actualmente.";
        }else{
            Study = "No se encuentra estudiando actualmente.";
        }
    return Study;
    }
    public String hijos1 (){
        String Hijos;
        if (isChildren()== true){
            Hijos = "Si";
        }else{
            Hijos = "No";
        }
    return Hijos;
    }
    public void hijos(){
        if (isChildren()== true){
            System.out.println("Ingrese el número de hijos");
            Scanner Number = new Scanner(System.in);
            int NumberChild = Number.nextInt();
            setChildrenNumber(NumberChild);
            System.out.println("     >>Tiene " + getChildrenNumber() + " hijos.");
        } else            
        setChildrenNumber(0);
    }
      
        
}
    

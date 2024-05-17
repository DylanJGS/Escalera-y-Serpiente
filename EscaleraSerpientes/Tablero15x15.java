
package EscaleraSerpientes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Tablero15x15 extends javax.swing.JFrame {
    
    Juego juego=new Juego();
    Jugador[]jugadores;
    
    private Serpientes[] serpientes =new Serpientes[6];
    Serpientes serpiente1 =new Serpientes(65,4);
    Serpientes serpiente2 =new Serpientes(99,21);
    Serpientes serpiente3 =new Serpientes(175,37);
    Serpientes serpiente4 =new Serpientes(162,146);
    Serpientes serpiente5 =new Serpientes(221,195);
    Serpientes serpiente6 =new Serpientes(209,120);
    
    private Escaleras[] escaleras =new Escaleras[6];
    Escaleras escalera1 =new Escaleras(7, 68);
    Escaleras escalera2 =new Escaleras(27,93);
    Escaleras escalera3 =new Escaleras(41,172);
    Escaleras escalera4 =new Escaleras(78,133);
    Escaleras escalera5 =new Escaleras(148,207);
    Escaleras escalera6 =new Escaleras(111,192);
    
    JLabel lbs[]=new JLabel[225];
    private int turno=0;
    private String valorDado;

    
    public Tablero15x15() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        juego.setEnJuego(true);
        
        serpientes[0]=serpiente1;
        serpientes[1]=serpiente2;
        serpientes[2]=serpiente3;
        serpientes[3]=serpiente4;
        serpientes[4]=serpiente5;
        serpientes[5]=serpiente6;

        escaleras[0]=escalera1;
        escaleras[1]=escalera2;
        escaleras[2]=escalera3;
        escaleras[3]=escalera4;
        escaleras[4]=escalera5;
        escaleras[5]=escalera6;
        
        lbs[0]=ja;
        lbs[1]=jb;
        lbs[2]=jc;
        lbs[3]=jd;
        lbs[4]=je;
        lbs[5]=jf;
        lbs[6]=jg;
        lbs[7]=jh;
        lbs[8]=ji;
        lbs[9]=jj;
        lbs[10]=jk;
        lbs[11]=jl;
        lbs[12]=jm;
        lbs[13]=jn;
        lbs[14]=jo;
        lbs[15]=jp;
        lbs[16]=jq;
        lbs[17]=js;
        lbs[18]=jt;
        lbs[19]=ju;
        lbs[20]=jv;
        lbs[21]=jw;
        lbs[22]=jx;
        lbs[23]=jy;
        lbs[24]=jz;
        lbs[25]=ja1;
        lbs[26]=jb1;
        lbs[27]=jc1;
        lbs[28]=jd1;
        lbs[29]=je1;
        lbs[30]=jf1;
        lbs[31]=jg1;
        lbs[32]=jh1;
        lbs[33]=ji1;
        lbs[24]=jj1;
        lbs[35]=jk1;
        lbs[36]=jl1;
        lbs[37]=jm1;
        lbs[38]=jn1;
        lbs[39]=jo1;
        lbs[40]=jp1;
        lbs[41]=jq1;
        lbs[42]=js1;
        lbs[43]=jt1;
        lbs[44]=ju1;
        lbs[45]=jv1;
        lbs[46]=jw1;
        lbs[47]=jx1;
        lbs[48]=jy1;
        lbs[49]=jz1;
        lbs[50]=ja2;
        lbs[51]=jb2;
        lbs[52]=jc2;
        lbs[53]=jd2;
        lbs[54]=je2;
        lbs[55]=jf2;
        lbs[56]=jg2;
        lbs[57]=jh2;
        lbs[58]=ji2;
        lbs[59]=jj2;
        lbs[60]=jk2;
        lbs[61]=jl2;
        lbs[62]=jm2;
        lbs[63]=jn2;
        lbs[64]=jo2;
        lbs[65]=jp2;
        lbs[66]=jq2;
        lbs[67]=js2;
        lbs[68]=jt2;
        lbs[69]=ju2;
        lbs[70]=jv2;
        lbs[71]=jw2;
        lbs[72]=jx2;
        lbs[73]=jy2;
        lbs[74]=jz2;
        lbs[75]=ja3;
        lbs[76]=jb3;
        lbs[77]=jc3;
        lbs[78]=jd3;
        lbs[79]=je3;
        lbs[80]=jf3;
        lbs[81]=jg3;
        lbs[82]=jh3;
        lbs[83]=ji3;
        lbs[84]=jj3;
        lbs[85]=jk3;
        lbs[86]=jl3;
        lbs[87]=jm3;
        lbs[88]=jn3;
        lbs[89]=jo3;
        lbs[90]=jp3;
        lbs[91]=jq3;
        lbs[92]=js3;
        lbs[93]=jt3;
        lbs[94]=ju3;
        lbs[95]=jv3;
        lbs[96]=jw3;
        lbs[97]=jx3;
        lbs[98]=jy3;
        lbs[99]=jz3;
        lbs[100]=ja4;
        lbs[101]=jb4;
        lbs[102]=jc4;
        lbs[103]=jd4;
        lbs[104]=je4;
        lbs[105]=jf4;
        lbs[106]=jg4;
        lbs[107]=jh4;
        lbs[108]=ji4;
        lbs[109]=jj4;
        lbs[110]=jk4;
        lbs[111]=jl4;
        lbs[112]=jm4;
        lbs[113]=jn4;
        lbs[114]=jo4;
        lbs[115]=jp4;
        lbs[116]=jq4;
        lbs[117]=js4;
        lbs[118]=jt4;
        lbs[119]=ju4;
        lbs[120]=jv4;
        lbs[121]=jw4;
        lbs[122]=jx4;
        lbs[123]=jy4;
        lbs[124]=jz4;
        lbs[125]=ja5;
        lbs[126]=jb5;
        lbs[127]=jc5;
        lbs[128]=jd5;
        lbs[129]=je5;
        lbs[130]=jf5;
        lbs[131]=jg5;
        lbs[132]=jh5;
        lbs[133]=ji5;
        lbs[134]=jj5;
        lbs[135]=jk5;
        lbs[136]=jl5;
        lbs[137]=jm5;
        lbs[138]=jn5;
        lbs[139]=jo5;
        lbs[140]=jp5;
        lbs[141]=jq5;
        lbs[142]=js5;
        lbs[143]=jt5;
        lbs[144]=ju5;
        lbs[145]=jv5;
        lbs[146]=jw5;
        lbs[147]=jx5;
        lbs[148]=jy5;
        lbs[149]=jz5;
        lbs[150]=ja6;
        lbs[151]=jb6;
        lbs[152]=jc6;
        lbs[153]=jd6;
        lbs[154]=je6;
        lbs[155]=jf6;
        lbs[156]=jg6;
        lbs[157]=jh6;
        lbs[158]=ji6;
        lbs[159]=jj6;
        lbs[160]=jk6;
        lbs[161]=jl6;
        lbs[162]=jm6;
        lbs[163]=jn6;
        lbs[164]=jo6;
        lbs[165]=jp6;
        lbs[166]=jq6;
        lbs[167]=js6;
        lbs[168]=jt6;
        lbs[169]=ju6;
        lbs[170]=jv6;
        lbs[171]=jw6;
        lbs[172]=jx6;
        lbs[173]=jy6;
        lbs[174]=jz6;
        lbs[175]=ja7;
        lbs[176]=jb7;
        lbs[177]=jc7;
        lbs[178]=jd7;
        lbs[179]=je7;
        lbs[180]=jf7;
        lbs[181]=jg7;
        lbs[182]=jh7;
        lbs[183]=ji7;
        lbs[184]=jj7;
        lbs[185]=jk7;
        lbs[186]=jl7;
        lbs[187]=jm7;
        lbs[188]=jn7;
        lbs[189]=jo7;
        lbs[190]=jp7;
        lbs[191]=jq7;
        lbs[192]=js7;
        lbs[193]=jt7;
        lbs[194]=ju7;
        lbs[195]=jv7;
        lbs[196]=jw7;
        lbs[197]=jx7;
        lbs[198]=jy7;
        lbs[199]=jz7;
        lbs[200]=ja8;
        lbs[201]=jb8;
        lbs[202]=jc8;
        lbs[203]=jd8;
        lbs[204]=je8;
        lbs[205]=jf8;
        lbs[206]=jg8;
        lbs[207]=jh8;
        lbs[208]=ji8;
        lbs[209]=jj8;
        lbs[210]=jk8;
        lbs[211]=jl8;
        lbs[212]=jm8;
        lbs[213]=jn8;
        lbs[214]=jo8;
        lbs[215]=jp8;
        lbs[216]=jq8;
        lbs[217]=js8;
        lbs[218]=jt8;
        lbs[219]=ju8;
        lbs[220]=jv8;
        lbs[221]=jw8;
        lbs[222]=jx8;
        lbs[223]=jy8;
        lbs[224]=jz8;
  
    }
    public void setJugadores2(Jugador jugador1, Jugador jugador2){
        this.jugadores=new Jugador[2];
        this.jugadores[0]=jugador1;
        this.jugadores[1]=jugador2;
        
        
        jlPrimer2.setText(this.jugadores[0].getNombre()+": "+this.jugadores[0].getFicha());
        jlSegundo2.setText(this.jugadores[1].getNombre()+": "+this.jugadores[1].getFicha());
        jlTercer2.setVisible(false);
        jlCuarto2.setVisible(false);
    }
    
    public void setJugadores3(Jugador jugador1, Jugador jugador2, Jugador jugador3){
        this.jugadores=new Jugador[3];
        this.jugadores[0]=jugador1;
        this.jugadores[1]=jugador2;
        this.jugadores[2]=jugador3;
        
        jlPrimer2.setText(this.jugadores[0].getNombre()+": "+this.jugadores[0].getFicha());
        jlSegundo2.setText(this.jugadores[1].getNombre()+": "+this.jugadores[1].getFicha());
        jlTercer2.setText(this.jugadores[2].getNombre()+": "+this.jugadores[2].getFicha());
        jlCuarto2.setVisible(false);
    }
    
    public void setJugadores4(Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4){
        this.jugadores=new Jugador[4];
        this.jugadores[0]=jugador1;
        this.jugadores[1]=jugador2;
        this.jugadores[2]=jugador3;
        this.jugadores[3]=jugador4;
        
        jlPrimer2.setText(this.jugadores[0].getNombre()+": "+this.jugadores[0].getFicha());
        jlSegundo2.setText(this.jugadores[1].getNombre()+": "+this.jugadores[1].getFicha());
        jlTercer2.setText(this.jugadores[2].getNombre()+": "+this.jugadores[2].getFicha());
        jlCuarto2.setText(this.jugadores[3].getNombre()+": "+this.jugadores[3].getFicha());
    }
    private void comprobarSerpientes(Jugador jugadores){
        for(int i=0; i<serpientes.length; i++){
            if(jugadores.getPosicion()==serpientes[i].getInicio()){
                jugadores.setPosicion(serpientes[i].getFin());
                JOptionPane.showMessageDialog(rootPane, jugadores.getNombre()+" ha caido en una serpiente, su ficha se movera a la posicion: "+jugadores.getPosicion());
            }
        }
    }
    
    private void comprobarEscaleras(Jugador jugadores){
         for(int i=0; i<escaleras.length; i++){
            if(jugadores.getPosicion()==escaleras[i].getInicio()){
                jugadores.setPosicion(escaleras[i].getFin());
                JOptionPane.showMessageDialog(rootPane, jugadores.getNombre()+" ha caido en una escalera, su ficha se movera a la posicion: "+jugadores.getPosicion());
            }
        }
    }
    private void comprobarGanador(){
        if(jugadores[turno].getPosicion()==225){
            JOptionPane.showMessageDialog(rootPane, "Felicidades "+jugadores[turno].getNombre()+", has ganado!");
            juego.setEnJuego(false);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jC = new javax.swing.JLabel();
        jE = new javax.swing.JLabel();
        jF = new javax.swing.JLabel();
        jT3 = new javax.swing.JLabel();
        jS3 = new javax.swing.JLabel();
        jQ3 = new javax.swing.JLabel();
        jP3 = new javax.swing.JLabel();
        jG = new javax.swing.JLabel();
        jE4 = new javax.swing.JLabel();
        jH = new javax.swing.JLabel();
        jD4 = new javax.swing.JLabel();
        jI = new javax.swing.JLabel();
        jC4 = new javax.swing.JLabel();
        jB4 = new javax.swing.JLabel();
        jA4 = new javax.swing.JLabel();
        jK4 = new javax.swing.JLabel();
        jL4 = new javax.swing.JLabel();
        jM4 = new javax.swing.JLabel();
        jN4 = new javax.swing.JLabel();
        jO4 = new javax.swing.JLabel();
        jP4 = new javax.swing.JLabel();
        jQ4 = new javax.swing.JLabel();
        jS4 = new javax.swing.JLabel();
        jT4 = new javax.swing.JLabel();
        jU4 = new javax.swing.JLabel();
        jE5 = new javax.swing.JLabel();
        jZ = new javax.swing.JLabel();
        jD5 = new javax.swing.JLabel();
        jA1 = new javax.swing.JLabel();
        jC5 = new javax.swing.JLabel();
        jW1 = new javax.swing.JLabel();
        jB5 = new javax.swing.JLabel();
        jX1 = new javax.swing.JLabel();
        jA5 = new javax.swing.JLabel();
        jY1 = new javax.swing.JLabel();
        jZ4 = new javax.swing.JLabel();
        jZ1 = new javax.swing.JLabel();
        jY4 = new javax.swing.JLabel();
        jJ2 = new javax.swing.JLabel();
        jX4 = new javax.swing.JLabel();
        jI2 = new javax.swing.JLabel();
        jW4 = new javax.swing.JLabel();
        jH2 = new javax.swing.JLabel();
        jV4 = new javax.swing.JLabel();
        jB1 = new javax.swing.JLabel();
        jF5 = new javax.swing.JLabel();
        jG2 = new javax.swing.JLabel();
        jG5 = new javax.swing.JLabel();
        jC1 = new javax.swing.JLabel();
        jH5 = new javax.swing.JLabel();
        jF2 = new javax.swing.JLabel();
        jI5 = new javax.swing.JLabel();
        jD1 = new javax.swing.JLabel();
        jJ5 = new javax.swing.JLabel();
        jE2 = new javax.swing.JLabel();
        jK5 = new javax.swing.JLabel();
        jE1 = new javax.swing.JLabel();
        jL5 = new javax.swing.JLabel();
        jO1 = new javax.swing.JLabel();
        jM5 = new javax.swing.JLabel();
        jN1 = new javax.swing.JLabel();
        jN5 = new javax.swing.JLabel();
        jM1 = new javax.swing.JLabel();
        jO5 = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jP5 = new javax.swing.JLabel();
        jK1 = new javax.swing.JLabel();
        jQ5 = new javax.swing.JLabel();
        jJ1 = new javax.swing.JLabel();
        jS5 = new javax.swing.JLabel();
        jD2 = new javax.swing.JLabel();
        jF6 = new javax.swing.JLabel();
        jC2 = new javax.swing.JLabel();
        jE6 = new javax.swing.JLabel();
        jB2 = new javax.swing.JLabel();
        jD6 = new javax.swing.JLabel();
        jA2 = new javax.swing.JLabel();
        jC6 = new javax.swing.JLabel();
        jK2 = new javax.swing.JLabel();
        jB6 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jA6 = new javax.swing.JLabel();
        jM2 = new javax.swing.JLabel();
        jZ5 = new javax.swing.JLabel();
        jN2 = new javax.swing.JLabel();
        jY5 = new javax.swing.JLabel();
        jO2 = new javax.swing.JLabel();
        jX5 = new javax.swing.JLabel();
        jP2 = new javax.swing.JLabel();
        jW5 = new javax.swing.JLabel();
        jQ2 = new javax.swing.JLabel();
        jV5 = new javax.swing.JLabel();
        jS2 = new javax.swing.JLabel();
        jU5 = new javax.swing.JLabel();
        jT2 = new javax.swing.JLabel();
        jT5 = new javax.swing.JLabel();
        jU2 = new javax.swing.JLabel();
        jG6 = new javax.swing.JLabel();
        jE3 = new javax.swing.JLabel();
        jH6 = new javax.swing.JLabel();
        jD3 = new javax.swing.JLabel();
        jI6 = new javax.swing.JLabel();
        jC3 = new javax.swing.JLabel();
        jJ6 = new javax.swing.JLabel();
        jB3 = new javax.swing.JLabel();
        jK6 = new javax.swing.JLabel();
        jA3 = new javax.swing.JLabel();
        jL6 = new javax.swing.JLabel();
        jZ2 = new javax.swing.JLabel();
        jM6 = new javax.swing.JLabel();
        jY2 = new javax.swing.JLabel();
        jJ = new javax.swing.JLabel();
        jN6 = new javax.swing.JLabel();
        jX2 = new javax.swing.JLabel();
        jU = new javax.swing.JLabel();
        jO6 = new javax.swing.JLabel();
        jW2 = new javax.swing.JLabel();
        jT = new javax.swing.JLabel();
        jS = new javax.swing.JLabel();
        jQ = new javax.swing.JLabel();
        jP = new javax.swing.JLabel();
        jO = new javax.swing.JLabel();
        jI1 = new javax.swing.JLabel();
        jH1 = new javax.swing.JLabel();
        jG1 = new javax.swing.JLabel();
        jP6 = new javax.swing.JLabel();
        jV2 = new javax.swing.JLabel();
        jQ6 = new javax.swing.JLabel();
        jF3 = new javax.swing.JLabel();
        jS6 = new javax.swing.JLabel();
        jG3 = new javax.swing.JLabel();
        jT6 = new javax.swing.JLabel();
        jH3 = new javax.swing.JLabel();
        jI3 = new javax.swing.JLabel();
        jJ3 = new javax.swing.JLabel();
        jK3 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jF1 = new javax.swing.JLabel();
        jM3 = new javax.swing.JLabel();
        jP1 = new javax.swing.JLabel();
        jN3 = new javax.swing.JLabel();
        jQ1 = new javax.swing.JLabel();
        jS1 = new javax.swing.JLabel();
        jN = new javax.swing.JLabel();
        jT1 = new javax.swing.JLabel();
        jM = new javax.swing.JLabel();
        jU1 = new javax.swing.JLabel();
        jL = new javax.swing.JLabel();
        jV1 = new javax.swing.JLabel();
        jO3 = new javax.swing.JLabel();
        jZ3 = new javax.swing.JLabel();
        jY3 = new javax.swing.JLabel();
        jX3 = new javax.swing.JLabel();
        jW3 = new javax.swing.JLabel();
        jV3 = new javax.swing.JLabel();
        jU3 = new javax.swing.JLabel();
        jD = new javax.swing.JLabel();
        jK = new javax.swing.JLabel();
        jA = new javax.swing.JLabel();
        jV = new javax.swing.JLabel();
        jB = new javax.swing.JLabel();
        jW = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jY = new javax.swing.JLabel();
        jJ4 = new javax.swing.JLabel();
        jI4 = new javax.swing.JLabel();
        jH4 = new javax.swing.JLabel();
        jG4 = new javax.swing.JLabel();
        jF4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlPrimer = new javax.swing.JLabel();
        jlSegundo = new javax.swing.JLabel();
        jlTercer = new javax.swing.JLabel();
        jlCuarto = new javax.swing.JLabel();
        jbtnDado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jz = new javax.swing.JLabel();
        ja1 = new javax.swing.JLabel();
        jw1 = new javax.swing.JLabel();
        jx1 = new javax.swing.JLabel();
        jy1 = new javax.swing.JLabel();
        jz1 = new javax.swing.JLabel();
        jj2 = new javax.swing.JLabel();
        ji2 = new javax.swing.JLabel();
        jh2 = new javax.swing.JLabel();
        jb1 = new javax.swing.JLabel();
        jg2 = new javax.swing.JLabel();
        jc1 = new javax.swing.JLabel();
        jf2 = new javax.swing.JLabel();
        jd1 = new javax.swing.JLabel();
        je2 = new javax.swing.JLabel();
        je1 = new javax.swing.JLabel();
        jo1 = new javax.swing.JLabel();
        jn1 = new javax.swing.JLabel();
        jm1 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jk1 = new javax.swing.JLabel();
        jj1 = new javax.swing.JLabel();
        jd2 = new javax.swing.JLabel();
        jc2 = new javax.swing.JLabel();
        jb2 = new javax.swing.JLabel();
        ja2 = new javax.swing.JLabel();
        jk2 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jm2 = new javax.swing.JLabel();
        jn2 = new javax.swing.JLabel();
        jo2 = new javax.swing.JLabel();
        jp2 = new javax.swing.JLabel();
        jq2 = new javax.swing.JLabel();
        js2 = new javax.swing.JLabel();
        jt2 = new javax.swing.JLabel();
        ju2 = new javax.swing.JLabel();
        je3 = new javax.swing.JLabel();
        jd3 = new javax.swing.JLabel();
        jc3 = new javax.swing.JLabel();
        jb3 = new javax.swing.JLabel();
        ja3 = new javax.swing.JLabel();
        jz2 = new javax.swing.JLabel();
        jy2 = new javax.swing.JLabel();
        jx2 = new javax.swing.JLabel();
        jw2 = new javax.swing.JLabel();
        jv2 = new javax.swing.JLabel();
        jf3 = new javax.swing.JLabel();
        jg3 = new javax.swing.JLabel();
        jh3 = new javax.swing.JLabel();
        ji3 = new javax.swing.JLabel();
        jj3 = new javax.swing.JLabel();
        jk3 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jm3 = new javax.swing.JLabel();
        jn3 = new javax.swing.JLabel();
        jo3 = new javax.swing.JLabel();
        jz3 = new javax.swing.JLabel();
        jy3 = new javax.swing.JLabel();
        jx3 = new javax.swing.JLabel();
        jw3 = new javax.swing.JLabel();
        jv3 = new javax.swing.JLabel();
        ju3 = new javax.swing.JLabel();
        jd = new javax.swing.JLabel();
        ja = new javax.swing.JLabel();
        jb = new javax.swing.JLabel();
        jc = new javax.swing.JLabel();
        je = new javax.swing.JLabel();
        jf = new javax.swing.JLabel();
        jt3 = new javax.swing.JLabel();
        js3 = new javax.swing.JLabel();
        jq3 = new javax.swing.JLabel();
        jp3 = new javax.swing.JLabel();
        jg = new javax.swing.JLabel();
        jh = new javax.swing.JLabel();
        ji = new javax.swing.JLabel();
        jj = new javax.swing.JLabel();
        ju = new javax.swing.JLabel();
        jt = new javax.swing.JLabel();
        js = new javax.swing.JLabel();
        jq = new javax.swing.JLabel();
        jp = new javax.swing.JLabel();
        jo = new javax.swing.JLabel();
        ji1 = new javax.swing.JLabel();
        jh1 = new javax.swing.JLabel();
        jg1 = new javax.swing.JLabel();
        jf1 = new javax.swing.JLabel();
        jp1 = new javax.swing.JLabel();
        jq1 = new javax.swing.JLabel();
        js1 = new javax.swing.JLabel();
        jn = new javax.swing.JLabel();
        jt1 = new javax.swing.JLabel();
        jm = new javax.swing.JLabel();
        ju1 = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        jv1 = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        jv = new javax.swing.JLabel();
        jw = new javax.swing.JLabel();
        jx = new javax.swing.JLabel();
        jy = new javax.swing.JLabel();
        jj4 = new javax.swing.JLabel();
        ji4 = new javax.swing.JLabel();
        jh4 = new javax.swing.JLabel();
        jg4 = new javax.swing.JLabel();
        jf4 = new javax.swing.JLabel();
        je4 = new javax.swing.JLabel();
        jd4 = new javax.swing.JLabel();
        jc4 = new javax.swing.JLabel();
        jb4 = new javax.swing.JLabel();
        ja4 = new javax.swing.JLabel();
        jk4 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jm4 = new javax.swing.JLabel();
        jn4 = new javax.swing.JLabel();
        jo4 = new javax.swing.JLabel();
        jp4 = new javax.swing.JLabel();
        jq4 = new javax.swing.JLabel();
        js4 = new javax.swing.JLabel();
        jt4 = new javax.swing.JLabel();
        ju4 = new javax.swing.JLabel();
        je5 = new javax.swing.JLabel();
        jd5 = new javax.swing.JLabel();
        jc5 = new javax.swing.JLabel();
        jb5 = new javax.swing.JLabel();
        ja5 = new javax.swing.JLabel();
        jz4 = new javax.swing.JLabel();
        jy4 = new javax.swing.JLabel();
        jx4 = new javax.swing.JLabel();
        jw4 = new javax.swing.JLabel();
        jv4 = new javax.swing.JLabel();
        jf5 = new javax.swing.JLabel();
        jg5 = new javax.swing.JLabel();
        jh5 = new javax.swing.JLabel();
        ji5 = new javax.swing.JLabel();
        jj5 = new javax.swing.JLabel();
        jk5 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jm5 = new javax.swing.JLabel();
        jn5 = new javax.swing.JLabel();
        jo5 = new javax.swing.JLabel();
        jp5 = new javax.swing.JLabel();
        jq5 = new javax.swing.JLabel();
        js5 = new javax.swing.JLabel();
        jf6 = new javax.swing.JLabel();
        je6 = new javax.swing.JLabel();
        jd6 = new javax.swing.JLabel();
        jc6 = new javax.swing.JLabel();
        jb6 = new javax.swing.JLabel();
        ja6 = new javax.swing.JLabel();
        jz5 = new javax.swing.JLabel();
        jy5 = new javax.swing.JLabel();
        jx5 = new javax.swing.JLabel();
        jw5 = new javax.swing.JLabel();
        jv5 = new javax.swing.JLabel();
        ju5 = new javax.swing.JLabel();
        jt5 = new javax.swing.JLabel();
        jg6 = new javax.swing.JLabel();
        jh6 = new javax.swing.JLabel();
        ji6 = new javax.swing.JLabel();
        jj6 = new javax.swing.JLabel();
        jk6 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jm6 = new javax.swing.JLabel();
        jn6 = new javax.swing.JLabel();
        jo6 = new javax.swing.JLabel();
        jp6 = new javax.swing.JLabel();
        jq6 = new javax.swing.JLabel();
        js6 = new javax.swing.JLabel();
        jt6 = new javax.swing.JLabel();
        ju6 = new javax.swing.JLabel();
        jv6 = new javax.swing.JLabel();
        jw6 = new javax.swing.JLabel();
        jx6 = new javax.swing.JLabel();
        jy6 = new javax.swing.JLabel();
        jz6 = new javax.swing.JLabel();
        ja7 = new javax.swing.JLabel();
        jb7 = new javax.swing.JLabel();
        jc7 = new javax.swing.JLabel();
        jd7 = new javax.swing.JLabel();
        je7 = new javax.swing.JLabel();
        jf7 = new javax.swing.JLabel();
        jg7 = new javax.swing.JLabel();
        jh7 = new javax.swing.JLabel();
        ji7 = new javax.swing.JLabel();
        jj7 = new javax.swing.JLabel();
        jk7 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        jm7 = new javax.swing.JLabel();
        jn7 = new javax.swing.JLabel();
        jo7 = new javax.swing.JLabel();
        jp7 = new javax.swing.JLabel();
        jq7 = new javax.swing.JLabel();
        js7 = new javax.swing.JLabel();
        jt7 = new javax.swing.JLabel();
        ju7 = new javax.swing.JLabel();
        jv7 = new javax.swing.JLabel();
        jw7 = new javax.swing.JLabel();
        jx7 = new javax.swing.JLabel();
        jy7 = new javax.swing.JLabel();
        jz7 = new javax.swing.JLabel();
        ja8 = new javax.swing.JLabel();
        jb8 = new javax.swing.JLabel();
        jc8 = new javax.swing.JLabel();
        jd8 = new javax.swing.JLabel();
        je8 = new javax.swing.JLabel();
        jf8 = new javax.swing.JLabel();
        jg8 = new javax.swing.JLabel();
        jh8 = new javax.swing.JLabel();
        ji8 = new javax.swing.JLabel();
        jj8 = new javax.swing.JLabel();
        jk8 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jm8 = new javax.swing.JLabel();
        jn8 = new javax.swing.JLabel();
        jo8 = new javax.swing.JLabel();
        jp8 = new javax.swing.JLabel();
        jq8 = new javax.swing.JLabel();
        js8 = new javax.swing.JLabel();
        jt8 = new javax.swing.JLabel();
        ju8 = new javax.swing.JLabel();
        jv8 = new javax.swing.JLabel();
        jw8 = new javax.swing.JLabel();
        jx8 = new javax.swing.JLabel();
        jy8 = new javax.swing.JLabel();
        jz8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlPrimer2 = new javax.swing.JLabel();
        jlSegundo2 = new javax.swing.JLabel();
        jlTercer2 = new javax.swing.JLabel();
        jlCuarto2 = new javax.swing.JLabel();
        btnDado = new javax.swing.JButton();
        lblDado = new javax.swing.JLabel();
        jbtnVolver1 = new javax.swing.JButton();

        jC.setBackground(new java.awt.Color(102, 255, 102));
        jC.setText("3");
        jC.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC.setOpaque(true);

        jE.setBackground(new java.awt.Color(102, 255, 102));
        jE.setText("5");
        jE.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE.setOpaque(true);

        jF.setBackground(new java.awt.Color(255, 255, 255));
        jF.setText("6");
        jF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF.setOpaque(true);

        jT3.setBackground(new java.awt.Color(255, 255, 255));
        jT3.setText("94");
        jT3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT3.setOpaque(true);

        jS3.setBackground(new java.awt.Color(102, 255, 102));
        jS3.setText("93");
        jS3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS3.setOpaque(true);

        jQ3.setBackground(new java.awt.Color(255, 255, 255));
        jQ3.setText("92");
        jQ3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ3.setOpaque(true);

        jP3.setBackground(new java.awt.Color(102, 255, 102));
        jP3.setText("91");
        jP3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP3.setOpaque(true);

        jG.setBackground(new java.awt.Color(102, 255, 102));
        jG.setText("7");
        jG.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG.setOpaque(true);

        jE4.setBackground(new java.awt.Color(102, 255, 102));
        jE4.setText("105");
        jE4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE4.setOpaque(true);

        jH.setBackground(new java.awt.Color(255, 255, 255));
        jH.setText("8");
        jH.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH.setOpaque(true);

        jD4.setBackground(new java.awt.Color(255, 255, 255));
        jD4.setText("104");
        jD4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD4.setOpaque(true);

        jI.setBackground(new java.awt.Color(102, 255, 102));
        jI.setText("9");
        jI.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI.setOpaque(true);

        jC4.setBackground(new java.awt.Color(102, 255, 102));
        jC4.setText("103");
        jC4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC4.setOpaque(true);

        jB4.setBackground(new java.awt.Color(255, 255, 255));
        jB4.setText("102");
        jB4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB4.setOpaque(true);

        jA4.setBackground(new java.awt.Color(102, 255, 102));
        jA4.setText("101");
        jA4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA4.setOpaque(true);

        jK4.setBackground(new java.awt.Color(102, 255, 102));
        jK4.setText("111");
        jK4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK4.setOpaque(true);

        jL4.setBackground(new java.awt.Color(255, 255, 255));
        jL4.setText("112");
        jL4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL4.setOpaque(true);

        jM4.setBackground(new java.awt.Color(102, 255, 102));
        jM4.setText("113");
        jM4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM4.setOpaque(true);

        jN4.setBackground(new java.awt.Color(255, 255, 255));
        jN4.setText("114");
        jN4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN4.setOpaque(true);

        jO4.setBackground(new java.awt.Color(102, 255, 102));
        jO4.setText("115");
        jO4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO4.setOpaque(true);

        jP4.setBackground(new java.awt.Color(255, 255, 255));
        jP4.setText("116");
        jP4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP4.setOpaque(true);

        jQ4.setBackground(new java.awt.Color(102, 255, 102));
        jQ4.setText("117");
        jQ4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ4.setOpaque(true);

        jS4.setBackground(new java.awt.Color(255, 255, 255));
        jS4.setText("118");
        jS4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS4.setOpaque(true);

        jT4.setBackground(new java.awt.Color(102, 255, 102));
        jT4.setText("119");
        jT4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT4.setOpaque(true);

        jU4.setBackground(new java.awt.Color(255, 255, 255));
        jU4.setText("120");
        jU4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU4.setOpaque(true);

        jE5.setBackground(new java.awt.Color(255, 255, 255));
        jE5.setText("130");
        jE5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE5.setOpaque(true);

        jZ.setBackground(new java.awt.Color(102, 255, 102));
        jZ.setText("25");
        jZ.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ.setOpaque(true);

        jD5.setBackground(new java.awt.Color(102, 255, 102));
        jD5.setText("129");
        jD5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD5.setOpaque(true);

        jA1.setBackground(new java.awt.Color(255, 255, 255));
        jA1.setText("26");
        jA1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA1.setOpaque(true);

        jC5.setBackground(new java.awt.Color(255, 255, 255));
        jC5.setText("128");
        jC5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC5.setOpaque(true);

        jW1.setBackground(new java.awt.Color(102, 255, 102));
        jW1.setText("47");
        jW1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW1.setOpaque(true);

        jB5.setBackground(new java.awt.Color(102, 255, 102));
        jB5.setText("127");
        jB5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB5.setOpaque(true);

        jX1.setBackground(new java.awt.Color(255, 255, 255));
        jX1.setText("48");
        jX1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX1.setOpaque(true);

        jA5.setBackground(new java.awt.Color(255, 255, 255));
        jA5.setText("126");
        jA5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA5.setOpaque(true);

        jY1.setBackground(new java.awt.Color(102, 255, 102));
        jY1.setText("49");
        jY1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY1.setOpaque(true);

        jZ4.setBackground(new java.awt.Color(102, 255, 102));
        jZ4.setText("125");
        jZ4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ4.setOpaque(true);

        jZ1.setBackground(new java.awt.Color(255, 255, 255));
        jZ1.setText("50");
        jZ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ1.setOpaque(true);

        jY4.setBackground(new java.awt.Color(255, 255, 255));
        jY4.setText("124");
        jY4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY4.setOpaque(true);

        jJ2.setBackground(new java.awt.Color(255, 255, 255));
        jJ2.setText("60");
        jJ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ2.setOpaque(true);

        jX4.setBackground(new java.awt.Color(102, 255, 102));
        jX4.setText("123");
        jX4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX4.setOpaque(true);

        jI2.setBackground(new java.awt.Color(102, 255, 102));
        jI2.setText("59");
        jI2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI2.setOpaque(true);

        jW4.setBackground(new java.awt.Color(255, 255, 255));
        jW4.setText("122");
        jW4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW4.setOpaque(true);

        jH2.setBackground(new java.awt.Color(255, 255, 255));
        jH2.setText("58");
        jH2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH2.setOpaque(true);

        jV4.setBackground(new java.awt.Color(102, 255, 102));
        jV4.setText("121");
        jV4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV4.setOpaque(true);

        jB1.setBackground(new java.awt.Color(102, 255, 102));
        jB1.setText("27");
        jB1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB1.setOpaque(true);

        jF5.setBackground(new java.awt.Color(102, 255, 102));
        jF5.setText("131");
        jF5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF5.setOpaque(true);

        jG2.setBackground(new java.awt.Color(102, 255, 102));
        jG2.setText("57");
        jG2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG2.setOpaque(true);

        jG5.setBackground(new java.awt.Color(255, 255, 255));
        jG5.setText("132");
        jG5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG5.setOpaque(true);

        jC1.setBackground(new java.awt.Color(255, 255, 255));
        jC1.setText("28");
        jC1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC1.setOpaque(true);

        jH5.setBackground(new java.awt.Color(102, 255, 102));
        jH5.setText("133");
        jH5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH5.setOpaque(true);

        jF2.setBackground(new java.awt.Color(255, 255, 255));
        jF2.setText("56");
        jF2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF2.setOpaque(true);

        jI5.setBackground(new java.awt.Color(255, 255, 255));
        jI5.setText("134");
        jI5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI5.setOpaque(true);

        jD1.setBackground(new java.awt.Color(102, 255, 102));
        jD1.setText("29");
        jD1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD1.setOpaque(true);

        jJ5.setBackground(new java.awt.Color(102, 255, 102));
        jJ5.setText("135");
        jJ5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ5.setOpaque(true);

        jE2.setBackground(new java.awt.Color(102, 255, 102));
        jE2.setText("55");
        jE2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE2.setOpaque(true);

        jK5.setBackground(new java.awt.Color(255, 255, 255));
        jK5.setText("136");
        jK5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK5.setOpaque(true);

        jE1.setBackground(new java.awt.Color(255, 255, 255));
        jE1.setText("30");
        jE1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE1.setOpaque(true);

        jL5.setBackground(new java.awt.Color(102, 255, 102));
        jL5.setText("137");
        jL5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL5.setOpaque(true);

        jO1.setBackground(new java.awt.Color(255, 255, 255));
        jO1.setText("40");
        jO1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO1.setOpaque(true);

        jM5.setBackground(new java.awt.Color(255, 255, 255));
        jM5.setText("138");
        jM5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM5.setOpaque(true);

        jN1.setBackground(new java.awt.Color(102, 255, 102));
        jN1.setText("39");
        jN1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN1.setOpaque(true);

        jN5.setBackground(new java.awt.Color(102, 255, 102));
        jN5.setText("139");
        jN5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN5.setOpaque(true);

        jM1.setBackground(new java.awt.Color(255, 255, 255));
        jM1.setText("38");
        jM1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM1.setOpaque(true);

        jO5.setBackground(new java.awt.Color(255, 255, 255));
        jO5.setText("140");
        jO5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO5.setOpaque(true);

        jL1.setBackground(new java.awt.Color(102, 255, 102));
        jL1.setText("37");
        jL1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL1.setOpaque(true);

        jP5.setBackground(new java.awt.Color(102, 255, 102));
        jP5.setText("141");
        jP5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP5.setOpaque(true);

        jK1.setBackground(new java.awt.Color(255, 255, 255));
        jK1.setText("36");
        jK1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK1.setOpaque(true);

        jQ5.setBackground(new java.awt.Color(255, 255, 255));
        jQ5.setText("142");
        jQ5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ5.setOpaque(true);

        jJ1.setBackground(new java.awt.Color(102, 255, 102));
        jJ1.setText("35");
        jJ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ1.setOpaque(true);

        jS5.setBackground(new java.awt.Color(102, 255, 102));
        jS5.setText("143");
        jS5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS5.setOpaque(true);

        jD2.setBackground(new java.awt.Color(255, 255, 255));
        jD2.setText("54");
        jD2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD2.setOpaque(true);

        jF6.setBackground(new java.awt.Color(255, 255, 255));
        jF6.setText("156");
        jF6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF6.setOpaque(true);

        jC2.setBackground(new java.awt.Color(102, 255, 102));
        jC2.setText("53");
        jC2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC2.setOpaque(true);

        jE6.setBackground(new java.awt.Color(102, 255, 102));
        jE6.setText("155");
        jE6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE6.setOpaque(true);

        jB2.setBackground(new java.awt.Color(255, 255, 255));
        jB2.setText("52");
        jB2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB2.setOpaque(true);

        jD6.setBackground(new java.awt.Color(255, 255, 255));
        jD6.setText("154");
        jD6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD6.setOpaque(true);

        jA2.setBackground(new java.awt.Color(102, 255, 102));
        jA2.setText("51");
        jA2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA2.setOpaque(true);

        jC6.setBackground(new java.awt.Color(102, 255, 102));
        jC6.setText("153");
        jC6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC6.setOpaque(true);

        jK2.setBackground(new java.awt.Color(102, 255, 102));
        jK2.setText("61");
        jK2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK2.setOpaque(true);

        jB6.setBackground(new java.awt.Color(255, 255, 255));
        jB6.setText("152");
        jB6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB6.setOpaque(true);

        jL2.setBackground(new java.awt.Color(255, 255, 255));
        jL2.setText("62");
        jL2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL2.setOpaque(true);

        jA6.setBackground(new java.awt.Color(102, 255, 102));
        jA6.setText("151");
        jA6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA6.setOpaque(true);

        jM2.setBackground(new java.awt.Color(102, 255, 102));
        jM2.setText("63");
        jM2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM2.setOpaque(true);

        jZ5.setBackground(new java.awt.Color(255, 255, 255));
        jZ5.setText("150");
        jZ5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ5.setOpaque(true);

        jN2.setBackground(new java.awt.Color(255, 255, 255));
        jN2.setText("64");
        jN2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN2.setOpaque(true);

        jY5.setBackground(new java.awt.Color(102, 255, 102));
        jY5.setText("149");
        jY5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY5.setOpaque(true);

        jO2.setBackground(new java.awt.Color(102, 255, 102));
        jO2.setText("65");
        jO2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO2.setOpaque(true);

        jX5.setBackground(new java.awt.Color(255, 255, 255));
        jX5.setText("148");
        jX5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX5.setOpaque(true);

        jP2.setBackground(new java.awt.Color(255, 255, 255));
        jP2.setText("66");
        jP2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP2.setOpaque(true);

        jW5.setBackground(new java.awt.Color(102, 255, 102));
        jW5.setText("147");
        jW5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW5.setOpaque(true);

        jQ2.setBackground(new java.awt.Color(102, 255, 102));
        jQ2.setText("67");
        jQ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ2.setOpaque(true);

        jV5.setBackground(new java.awt.Color(255, 255, 255));
        jV5.setText("146");
        jV5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV5.setOpaque(true);

        jS2.setBackground(new java.awt.Color(255, 255, 255));
        jS2.setText("68");
        jS2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS2.setOpaque(true);

        jU5.setBackground(new java.awt.Color(102, 255, 102));
        jU5.setText("145");
        jU5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU5.setOpaque(true);

        jT2.setBackground(new java.awt.Color(102, 255, 102));
        jT2.setText("69");
        jT2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT2.setOpaque(true);

        jT5.setBackground(new java.awt.Color(255, 255, 255));
        jT5.setText("144");
        jT5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT5.setOpaque(true);

        jU2.setBackground(new java.awt.Color(255, 255, 255));
        jU2.setText("70");
        jU2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU2.setOpaque(true);

        jG6.setBackground(new java.awt.Color(102, 255, 102));
        jG6.setText("157");
        jG6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG6.setOpaque(true);

        jE3.setBackground(new java.awt.Color(255, 255, 255));
        jE3.setText("80");
        jE3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE3.setOpaque(true);

        jH6.setBackground(new java.awt.Color(255, 255, 255));
        jH6.setText("158");
        jH6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH6.setOpaque(true);

        jD3.setBackground(new java.awt.Color(102, 255, 102));
        jD3.setText("79");
        jD3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD3.setOpaque(true);

        jI6.setBackground(new java.awt.Color(102, 255, 102));
        jI6.setText("159");
        jI6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI6.setOpaque(true);

        jC3.setBackground(new java.awt.Color(255, 255, 255));
        jC3.setText("78");
        jC3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC3.setOpaque(true);

        jJ6.setBackground(new java.awt.Color(255, 255, 255));
        jJ6.setText("160");
        jJ6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ6.setOpaque(true);

        jB3.setBackground(new java.awt.Color(102, 255, 102));
        jB3.setText("77");
        jB3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB3.setOpaque(true);

        jK6.setBackground(new java.awt.Color(102, 255, 102));
        jK6.setText("161");
        jK6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK6.setOpaque(true);

        jA3.setBackground(new java.awt.Color(255, 255, 255));
        jA3.setText("76");
        jA3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA3.setOpaque(true);

        jL6.setBackground(new java.awt.Color(255, 255, 255));
        jL6.setText("162");
        jL6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL6.setOpaque(true);

        jZ2.setBackground(new java.awt.Color(102, 255, 102));
        jZ2.setText("75");
        jZ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ2.setOpaque(true);

        jM6.setBackground(new java.awt.Color(102, 255, 102));
        jM6.setText("163");
        jM6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM6.setOpaque(true);

        jY2.setBackground(new java.awt.Color(255, 255, 255));
        jY2.setText("74");
        jY2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY2.setOpaque(true);

        jJ.setBackground(new java.awt.Color(255, 255, 255));
        jJ.setText("10");
        jJ.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ.setOpaque(true);

        jN6.setBackground(new java.awt.Color(255, 255, 255));
        jN6.setText("164");
        jN6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN6.setOpaque(true);

        jX2.setBackground(new java.awt.Color(102, 255, 102));
        jX2.setText("73");
        jX2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX2.setOpaque(true);

        jU.setBackground(new java.awt.Color(255, 255, 255));
        jU.setText("20");
        jU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU.setOpaque(true);

        jO6.setBackground(new java.awt.Color(102, 255, 102));
        jO6.setText("165");
        jO6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO6.setOpaque(true);

        jW2.setBackground(new java.awt.Color(255, 255, 255));
        jW2.setText("72");
        jW2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW2.setOpaque(true);

        jT.setBackground(new java.awt.Color(102, 255, 102));
        jT.setText("19");
        jT.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT.setOpaque(true);

        jS.setBackground(new java.awt.Color(255, 255, 255));
        jS.setText("18");
        jS.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS.setOpaque(true);

        jQ.setBackground(new java.awt.Color(102, 255, 102));
        jQ.setText("17");
        jQ.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ.setOpaque(true);

        jP.setBackground(new java.awt.Color(255, 255, 255));
        jP.setText("16");
        jP.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP.setOpaque(true);

        jO.setBackground(new java.awt.Color(102, 255, 102));
        jO.setText("15");
        jO.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO.setOpaque(true);

        jI1.setBackground(new java.awt.Color(255, 255, 255));
        jI1.setText("34");
        jI1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI1.setOpaque(true);

        jH1.setBackground(new java.awt.Color(102, 255, 102));
        jH1.setText("33");
        jH1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH1.setOpaque(true);

        jG1.setBackground(new java.awt.Color(255, 255, 255));
        jG1.setText("32");
        jG1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG1.setOpaque(true);

        jP6.setBackground(new java.awt.Color(255, 255, 255));
        jP6.setText("166");
        jP6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP6.setOpaque(true);

        jV2.setBackground(new java.awt.Color(102, 255, 102));
        jV2.setText("71");
        jV2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV2.setOpaque(true);

        jQ6.setBackground(new java.awt.Color(102, 255, 102));
        jQ6.setText("167");
        jQ6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ6.setOpaque(true);

        jF3.setBackground(new java.awt.Color(102, 255, 102));
        jF3.setText("81");
        jF3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF3.setOpaque(true);

        jS6.setBackground(new java.awt.Color(255, 255, 255));
        jS6.setText("168");
        jS6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS6.setOpaque(true);

        jG3.setBackground(new java.awt.Color(255, 255, 255));
        jG3.setText("82");
        jG3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG3.setOpaque(true);

        jT6.setBackground(new java.awt.Color(102, 255, 102));
        jT6.setText("169");
        jT6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT6.setOpaque(true);

        jH3.setBackground(new java.awt.Color(102, 255, 102));
        jH3.setText("83");
        jH3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH3.setOpaque(true);

        jI3.setBackground(new java.awt.Color(255, 255, 255));
        jI3.setText("84");
        jI3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI3.setOpaque(true);

        jJ3.setBackground(new java.awt.Color(102, 255, 102));
        jJ3.setText("85");
        jJ3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ3.setOpaque(true);

        jK3.setBackground(new java.awt.Color(255, 255, 255));
        jK3.setText("86");
        jK3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK3.setOpaque(true);

        jL3.setBackground(new java.awt.Color(102, 255, 102));
        jL3.setText("87");
        jL3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL3.setOpaque(true);

        jF1.setBackground(new java.awt.Color(102, 255, 102));
        jF1.setText("31");
        jF1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF1.setOpaque(true);

        jM3.setBackground(new java.awt.Color(255, 255, 255));
        jM3.setText("88");
        jM3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM3.setOpaque(true);

        jP1.setBackground(new java.awt.Color(102, 255, 102));
        jP1.setText("41");
        jP1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP1.setOpaque(true);

        jN3.setBackground(new java.awt.Color(102, 255, 102));
        jN3.setText("89");
        jN3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN3.setOpaque(true);

        jQ1.setBackground(new java.awt.Color(255, 255, 255));
        jQ1.setText("42");
        jQ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ1.setOpaque(true);

        jS1.setBackground(new java.awt.Color(102, 255, 102));
        jS1.setText("43");
        jS1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS1.setOpaque(true);

        jN.setBackground(new java.awt.Color(255, 255, 255));
        jN.setText("14");
        jN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN.setOpaque(true);

        jT1.setBackground(new java.awt.Color(255, 255, 255));
        jT1.setText("44");
        jT1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT1.setOpaque(true);

        jM.setBackground(new java.awt.Color(102, 255, 102));
        jM.setText("13");
        jM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM.setOpaque(true);

        jU1.setBackground(new java.awt.Color(102, 255, 102));
        jU1.setText("45");
        jU1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU1.setOpaque(true);

        jL.setBackground(new java.awt.Color(255, 255, 255));
        jL.setText("12");
        jL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL.setOpaque(true);

        jV1.setBackground(new java.awt.Color(255, 255, 255));
        jV1.setText("46");
        jV1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV1.setOpaque(true);

        jO3.setBackground(new java.awt.Color(255, 255, 255));
        jO3.setText("90");
        jO3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO3.setOpaque(true);

        jZ3.setBackground(new java.awt.Color(255, 255, 255));
        jZ3.setText("100");
        jZ3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ3.setOpaque(true);

        jY3.setBackground(new java.awt.Color(102, 255, 102));
        jY3.setText("99");
        jY3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY3.setOpaque(true);

        jX3.setBackground(new java.awt.Color(255, 255, 255));
        jX3.setText("98");
        jX3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX3.setOpaque(true);

        jW3.setBackground(new java.awt.Color(102, 255, 102));
        jW3.setText("97");
        jW3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW3.setOpaque(true);

        jV3.setBackground(new java.awt.Color(255, 255, 255));
        jV3.setText("96");
        jV3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV3.setOpaque(true);

        jU3.setBackground(new java.awt.Color(102, 255, 102));
        jU3.setText("95");
        jU3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU3.setOpaque(true);

        jD.setBackground(new java.awt.Color(255, 255, 255));
        jD.setText("4");
        jD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD.setOpaque(true);

        jK.setBackground(new java.awt.Color(102, 255, 102));
        jK.setText("11");
        jK.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK.setOpaque(true);

        jA.setBackground(new java.awt.Color(102, 255, 102));
        jA.setText("1");
        jA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA.setOpaque(true);

        jV.setBackground(new java.awt.Color(102, 255, 102));
        jV.setText("21");
        jV.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV.setOpaque(true);

        jB.setBackground(new java.awt.Color(255, 255, 255));
        jB.setText("2");
        jB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB.setOpaque(true);

        jW.setBackground(new java.awt.Color(255, 255, 255));
        jW.setText("22");
        jW.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW.setOpaque(true);

        jX.setBackground(new java.awt.Color(102, 255, 102));
        jX.setText("23");
        jX.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX.setOpaque(true);

        jY.setBackground(new java.awt.Color(255, 255, 255));
        jY.setText("24");
        jY.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY.setOpaque(true);

        jJ4.setBackground(new java.awt.Color(255, 255, 255));
        jJ4.setText("110");
        jJ4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ4.setOpaque(true);

        jI4.setBackground(new java.awt.Color(102, 255, 102));
        jI4.setText("109");
        jI4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI4.setOpaque(true);

        jH4.setBackground(new java.awt.Color(255, 255, 255));
        jH4.setText("108");
        jH4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH4.setOpaque(true);

        jG4.setBackground(new java.awt.Color(102, 255, 102));
        jG4.setText("107");
        jG4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG4.setOpaque(true);

        jF4.setBackground(new java.awt.Color(255, 255, 255));
        jF4.setText("106");
        jF4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF4.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jlPrimer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPrimer.setText("JUGADOR:");

        jlSegundo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSegundo.setText("JUGADOR:");

        jlTercer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlTercer.setText("JUGADOR:");

        jlCuarto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCuarto.setText("JUGADOR:");

        jbtnDado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnDado.setText("DADO");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setOpaque(true);

        jbtnVolver.setText("VOLVER");
        jbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlPrimer, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSegundo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTercer, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCuarto, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jbtnDado))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbtnVolver)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbtnVolver)
                .addGap(51, 51, 51)
                .addComponent(jlPrimer)
                .addGap(18, 18, 18)
                .addComponent(jlSegundo)
                .addGap(18, 18, 18)
                .addComponent(jlTercer)
                .addGap(18, 18, 18)
                .addComponent(jlCuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDado)
                .addGap(17, 17, 17))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TABLERO 15 X 15");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jz.setBackground(new java.awt.Color(102, 255, 102));
        jz.setText("25");
        jz.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz.setOpaque(true);

        ja1.setBackground(new java.awt.Color(255, 255, 255));
        ja1.setText("26");
        ja1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja1.setOpaque(true);

        jw1.setBackground(new java.awt.Color(102, 255, 102));
        jw1.setText("47");
        jw1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw1.setOpaque(true);

        jx1.setBackground(new java.awt.Color(255, 255, 255));
        jx1.setText("48");
        jx1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx1.setOpaque(true);

        jy1.setBackground(new java.awt.Color(102, 255, 102));
        jy1.setText("49");
        jy1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy1.setOpaque(true);

        jz1.setBackground(new java.awt.Color(255, 255, 255));
        jz1.setText("50");
        jz1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz1.setOpaque(true);

        jj2.setBackground(new java.awt.Color(255, 255, 255));
        jj2.setText("60");
        jj2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj2.setOpaque(true);

        ji2.setBackground(new java.awt.Color(102, 255, 102));
        ji2.setText("59");
        ji2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji2.setOpaque(true);

        jh2.setBackground(new java.awt.Color(255, 255, 255));
        jh2.setText("58");
        jh2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh2.setOpaque(true);

        jb1.setBackground(new java.awt.Color(255, 0, 0));
        jb1.setText("27");
        jb1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb1.setOpaque(true);

        jg2.setBackground(new java.awt.Color(102, 255, 102));
        jg2.setText("57");
        jg2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg2.setOpaque(true);

        jc1.setBackground(new java.awt.Color(255, 255, 255));
        jc1.setText("28");
        jc1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc1.setOpaque(true);

        jf2.setBackground(new java.awt.Color(255, 255, 255));
        jf2.setText("56");
        jf2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf2.setOpaque(true);

        jd1.setBackground(new java.awt.Color(102, 255, 102));
        jd1.setText("29");
        jd1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd1.setOpaque(true);

        je2.setBackground(new java.awt.Color(102, 255, 102));
        je2.setText("55");
        je2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je2.setOpaque(true);

        je1.setBackground(new java.awt.Color(255, 255, 255));
        je1.setText("30");
        je1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je1.setOpaque(true);

        jo1.setBackground(new java.awt.Color(255, 255, 255));
        jo1.setText("40");
        jo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo1.setOpaque(true);

        jn1.setBackground(new java.awt.Color(102, 255, 102));
        jn1.setText("39");
        jn1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn1.setOpaque(true);

        jm1.setBackground(new java.awt.Color(255, 255, 255));
        jm1.setText("38");
        jm1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm1.setOpaque(true);

        jl1.setBackground(new java.awt.Color(0, 0, 255));
        jl1.setText("37");
        jl1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl1.setOpaque(true);

        jk1.setBackground(new java.awt.Color(255, 255, 255));
        jk1.setText("36");
        jk1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk1.setOpaque(true);

        jj1.setBackground(new java.awt.Color(102, 255, 102));
        jj1.setText("35");
        jj1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj1.setOpaque(true);

        jd2.setBackground(new java.awt.Color(255, 255, 255));
        jd2.setText("54");
        jd2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd2.setOpaque(true);

        jc2.setBackground(new java.awt.Color(102, 255, 102));
        jc2.setText("53");
        jc2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc2.setOpaque(true);

        jb2.setBackground(new java.awt.Color(255, 255, 255));
        jb2.setText("52");
        jb2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb2.setOpaque(true);

        ja2.setBackground(new java.awt.Color(102, 255, 102));
        ja2.setText("51");
        ja2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja2.setOpaque(true);

        jk2.setBackground(new java.awt.Color(102, 255, 102));
        jk2.setText("61");
        jk2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk2.setOpaque(true);

        jl2.setBackground(new java.awt.Color(255, 255, 255));
        jl2.setText("62");
        jl2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl2.setOpaque(true);

        jm2.setBackground(new java.awt.Color(102, 255, 102));
        jm2.setText("63");
        jm2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm2.setOpaque(true);

        jn2.setBackground(new java.awt.Color(255, 255, 255));
        jn2.setText("64");
        jn2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn2.setOpaque(true);

        jo2.setBackground(new java.awt.Color(0, 0, 255));
        jo2.setText("65");
        jo2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo2.setOpaque(true);

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setText("66");
        jp2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp2.setOpaque(true);

        jq2.setBackground(new java.awt.Color(102, 255, 102));
        jq2.setText("67");
        jq2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq2.setOpaque(true);

        js2.setBackground(new java.awt.Color(255, 0, 0));
        js2.setText("68");
        js2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js2.setOpaque(true);

        jt2.setBackground(new java.awt.Color(102, 255, 102));
        jt2.setText("69");
        jt2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt2.setOpaque(true);

        ju2.setBackground(new java.awt.Color(255, 255, 255));
        ju2.setText("70");
        ju2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju2.setOpaque(true);

        je3.setBackground(new java.awt.Color(255, 255, 255));
        je3.setText("80");
        je3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je3.setOpaque(true);

        jd3.setBackground(new java.awt.Color(102, 255, 102));
        jd3.setText("79");
        jd3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd3.setOpaque(true);

        jc3.setBackground(new java.awt.Color(255, 0, 0));
        jc3.setText("78");
        jc3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc3.setOpaque(true);

        jb3.setBackground(new java.awt.Color(102, 255, 102));
        jb3.setText("77");
        jb3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb3.setOpaque(true);

        ja3.setBackground(new java.awt.Color(255, 255, 255));
        ja3.setText("76");
        ja3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja3.setOpaque(true);

        jz2.setBackground(new java.awt.Color(102, 255, 102));
        jz2.setText("75");
        jz2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz2.setOpaque(true);

        jy2.setBackground(new java.awt.Color(255, 255, 255));
        jy2.setText("74");
        jy2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy2.setOpaque(true);

        jx2.setBackground(new java.awt.Color(102, 255, 102));
        jx2.setText("73");
        jx2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx2.setOpaque(true);

        jw2.setBackground(new java.awt.Color(255, 255, 255));
        jw2.setText("72");
        jw2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw2.setOpaque(true);

        jv2.setBackground(new java.awt.Color(102, 255, 102));
        jv2.setText("71");
        jv2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv2.setOpaque(true);

        jf3.setBackground(new java.awt.Color(102, 255, 102));
        jf3.setText("81");
        jf3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf3.setOpaque(true);

        jg3.setBackground(new java.awt.Color(255, 255, 255));
        jg3.setText("82");
        jg3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg3.setOpaque(true);

        jh3.setBackground(new java.awt.Color(102, 255, 102));
        jh3.setText("83");
        jh3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh3.setOpaque(true);

        ji3.setBackground(new java.awt.Color(255, 255, 255));
        ji3.setText("84");
        ji3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji3.setOpaque(true);

        jj3.setBackground(new java.awt.Color(102, 255, 102));
        jj3.setText("85");
        jj3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj3.setOpaque(true);

        jk3.setBackground(new java.awt.Color(255, 255, 255));
        jk3.setText("86");
        jk3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk3.setOpaque(true);

        jl3.setBackground(new java.awt.Color(102, 255, 102));
        jl3.setText("87");
        jl3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl3.setOpaque(true);

        jm3.setBackground(new java.awt.Color(255, 255, 255));
        jm3.setText("88");
        jm3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm3.setOpaque(true);

        jn3.setBackground(new java.awt.Color(102, 255, 102));
        jn3.setText("89");
        jn3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn3.setOpaque(true);

        jo3.setBackground(new java.awt.Color(255, 255, 255));
        jo3.setText("90");
        jo3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo3.setOpaque(true);

        jz3.setBackground(new java.awt.Color(255, 255, 255));
        jz3.setText("100");
        jz3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz3.setOpaque(true);

        jy3.setBackground(new java.awt.Color(0, 0, 255));
        jy3.setText("99");
        jy3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy3.setOpaque(true);

        jx3.setBackground(new java.awt.Color(255, 255, 255));
        jx3.setText("98");
        jx3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx3.setOpaque(true);

        jw3.setBackground(new java.awt.Color(102, 255, 102));
        jw3.setText("97");
        jw3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw3.setOpaque(true);

        jv3.setBackground(new java.awt.Color(255, 255, 255));
        jv3.setText("96");
        jv3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv3.setOpaque(true);

        ju3.setBackground(new java.awt.Color(102, 255, 102));
        ju3.setText("95");
        ju3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju3.setOpaque(true);

        jd.setBackground(new java.awt.Color(0, 0, 255));
        jd.setText("4");
        jd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd.setOpaque(true);

        ja.setBackground(new java.awt.Color(102, 255, 102));
        ja.setText("1");
        ja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja.setOpaque(true);

        jb.setBackground(new java.awt.Color(255, 255, 255));
        jb.setText("2");
        jb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb.setOpaque(true);

        jc.setBackground(new java.awt.Color(102, 255, 102));
        jc.setText("3");
        jc.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc.setOpaque(true);

        je.setBackground(new java.awt.Color(102, 255, 102));
        je.setText("5");
        je.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je.setOpaque(true);

        jf.setBackground(new java.awt.Color(255, 255, 255));
        jf.setText("6");
        jf.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf.setOpaque(true);

        jt3.setBackground(new java.awt.Color(255, 255, 255));
        jt3.setText("94");
        jt3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt3.setOpaque(true);

        js3.setBackground(new java.awt.Color(255, 0, 0));
        js3.setText("93");
        js3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js3.setOpaque(true);

        jq3.setBackground(new java.awt.Color(255, 255, 255));
        jq3.setText("92");
        jq3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq3.setOpaque(true);

        jp3.setBackground(new java.awt.Color(102, 255, 102));
        jp3.setText("91");
        jp3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp3.setOpaque(true);

        jg.setBackground(new java.awt.Color(255, 0, 0));
        jg.setText("7");
        jg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg.setOpaque(true);

        jh.setBackground(new java.awt.Color(255, 255, 255));
        jh.setText("8");
        jh.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh.setOpaque(true);

        ji.setBackground(new java.awt.Color(102, 255, 102));
        ji.setText("9");
        ji.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji.setOpaque(true);

        jj.setBackground(new java.awt.Color(255, 255, 255));
        jj.setText("10");
        jj.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj.setOpaque(true);

        ju.setBackground(new java.awt.Color(255, 255, 255));
        ju.setText("20");
        ju.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju.setOpaque(true);

        jt.setBackground(new java.awt.Color(102, 255, 102));
        jt.setText("19");
        jt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt.setOpaque(true);

        js.setBackground(new java.awt.Color(255, 255, 255));
        js.setText("18");
        js.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js.setOpaque(true);

        jq.setBackground(new java.awt.Color(102, 255, 102));
        jq.setText("17");
        jq.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq.setOpaque(true);

        jp.setBackground(new java.awt.Color(255, 255, 255));
        jp.setText("16");
        jp.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp.setOpaque(true);

        jo.setBackground(new java.awt.Color(102, 255, 102));
        jo.setText("15");
        jo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo.setOpaque(true);

        ji1.setBackground(new java.awt.Color(255, 255, 255));
        ji1.setText("34");
        ji1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji1.setOpaque(true);

        jh1.setBackground(new java.awt.Color(102, 255, 102));
        jh1.setText("33");
        jh1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh1.setOpaque(true);

        jg1.setBackground(new java.awt.Color(255, 255, 255));
        jg1.setText("32");
        jg1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg1.setOpaque(true);

        jf1.setBackground(new java.awt.Color(102, 255, 102));
        jf1.setText("31");
        jf1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf1.setOpaque(true);

        jp1.setBackground(new java.awt.Color(255, 0, 0));
        jp1.setText("41");
        jp1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp1.setOpaque(true);

        jq1.setBackground(new java.awt.Color(255, 255, 255));
        jq1.setText("42");
        jq1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq1.setOpaque(true);

        js1.setBackground(new java.awt.Color(102, 255, 102));
        js1.setText("43");
        js1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js1.setOpaque(true);

        jn.setBackground(new java.awt.Color(255, 255, 255));
        jn.setText("14");
        jn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn.setOpaque(true);

        jt1.setBackground(new java.awt.Color(255, 255, 255));
        jt1.setText("44");
        jt1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt1.setOpaque(true);

        jm.setBackground(new java.awt.Color(102, 255, 102));
        jm.setText("13");
        jm.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm.setOpaque(true);

        ju1.setBackground(new java.awt.Color(102, 255, 102));
        ju1.setText("45");
        ju1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju1.setOpaque(true);

        jl.setBackground(new java.awt.Color(255, 255, 255));
        jl.setText("12");
        jl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl.setOpaque(true);

        jv1.setBackground(new java.awt.Color(255, 255, 255));
        jv1.setText("46");
        jv1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv1.setOpaque(true);

        jk.setBackground(new java.awt.Color(102, 255, 102));
        jk.setText("11");
        jk.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk.setOpaque(true);

        jv.setBackground(new java.awt.Color(0, 0, 255));
        jv.setText("21");
        jv.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv.setOpaque(true);

        jw.setBackground(new java.awt.Color(255, 255, 255));
        jw.setText("22");
        jw.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw.setOpaque(true);

        jx.setBackground(new java.awt.Color(102, 255, 102));
        jx.setText("23");
        jx.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx.setOpaque(true);

        jy.setBackground(new java.awt.Color(255, 255, 255));
        jy.setText("24");
        jy.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy.setOpaque(true);

        jj4.setBackground(new java.awt.Color(255, 255, 255));
        jj4.setText("110");
        jj4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj4.setOpaque(true);

        ji4.setBackground(new java.awt.Color(102, 255, 102));
        ji4.setText("109");
        ji4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji4.setOpaque(true);

        jh4.setBackground(new java.awt.Color(255, 255, 255));
        jh4.setText("108");
        jh4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh4.setOpaque(true);

        jg4.setBackground(new java.awt.Color(102, 255, 102));
        jg4.setText("107");
        jg4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg4.setOpaque(true);

        jf4.setBackground(new java.awt.Color(255, 255, 255));
        jf4.setText("106");
        jf4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf4.setOpaque(true);

        je4.setBackground(new java.awt.Color(102, 255, 102));
        je4.setText("105");
        je4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je4.setOpaque(true);

        jd4.setBackground(new java.awt.Color(255, 255, 255));
        jd4.setText("104");
        jd4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd4.setOpaque(true);

        jc4.setBackground(new java.awt.Color(102, 255, 102));
        jc4.setText("103");
        jc4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc4.setOpaque(true);

        jb4.setBackground(new java.awt.Color(255, 255, 255));
        jb4.setText("102");
        jb4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb4.setOpaque(true);

        ja4.setBackground(new java.awt.Color(102, 255, 102));
        ja4.setText("101");
        ja4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja4.setOpaque(true);

        jk4.setBackground(new java.awt.Color(255, 0, 0));
        jk4.setText("111");
        jk4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk4.setOpaque(true);

        jl4.setBackground(new java.awt.Color(255, 255, 255));
        jl4.setText("112");
        jl4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl4.setOpaque(true);

        jm4.setBackground(new java.awt.Color(102, 255, 102));
        jm4.setText("113");
        jm4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm4.setOpaque(true);

        jn4.setBackground(new java.awt.Color(255, 255, 255));
        jn4.setText("114");
        jn4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn4.setOpaque(true);

        jo4.setBackground(new java.awt.Color(102, 255, 102));
        jo4.setText("115");
        jo4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo4.setOpaque(true);

        jp4.setBackground(new java.awt.Color(255, 255, 255));
        jp4.setText("116");
        jp4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp4.setOpaque(true);

        jq4.setBackground(new java.awt.Color(102, 255, 102));
        jq4.setText("117");
        jq4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq4.setOpaque(true);

        js4.setBackground(new java.awt.Color(255, 255, 255));
        js4.setText("118");
        js4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js4.setOpaque(true);

        jt4.setBackground(new java.awt.Color(102, 255, 102));
        jt4.setText("119");
        jt4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt4.setOpaque(true);

        ju4.setBackground(new java.awt.Color(0, 51, 255));
        ju4.setText("120");
        ju4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju4.setOpaque(true);

        je5.setBackground(new java.awt.Color(255, 255, 255));
        je5.setText("130");
        je5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je5.setOpaque(true);

        jd5.setBackground(new java.awt.Color(102, 255, 102));
        jd5.setText("129");
        jd5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd5.setOpaque(true);

        jc5.setBackground(new java.awt.Color(255, 255, 255));
        jc5.setText("128");
        jc5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc5.setOpaque(true);

        jb5.setBackground(new java.awt.Color(102, 255, 102));
        jb5.setText("127");
        jb5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb5.setOpaque(true);

        ja5.setBackground(new java.awt.Color(255, 255, 255));
        ja5.setText("126");
        ja5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja5.setOpaque(true);

        jz4.setBackground(new java.awt.Color(102, 255, 102));
        jz4.setText("125");
        jz4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz4.setOpaque(true);

        jy4.setBackground(new java.awt.Color(255, 255, 255));
        jy4.setText("124");
        jy4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy4.setOpaque(true);

        jx4.setBackground(new java.awt.Color(102, 255, 102));
        jx4.setText("123");
        jx4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx4.setOpaque(true);

        jw4.setBackground(new java.awt.Color(255, 255, 255));
        jw4.setText("122");
        jw4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw4.setOpaque(true);

        jv4.setBackground(new java.awt.Color(102, 255, 102));
        jv4.setText("121");
        jv4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv4.setOpaque(true);

        jf5.setBackground(new java.awt.Color(102, 255, 102));
        jf5.setText("131");
        jf5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf5.setOpaque(true);

        jg5.setBackground(new java.awt.Color(255, 255, 255));
        jg5.setText("132");
        jg5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg5.setOpaque(true);

        jh5.setBackground(new java.awt.Color(255, 0, 0));
        jh5.setText("133");
        jh5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh5.setOpaque(true);

        ji5.setBackground(new java.awt.Color(255, 255, 255));
        ji5.setText("134");
        ji5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji5.setOpaque(true);

        jj5.setBackground(new java.awt.Color(102, 255, 102));
        jj5.setText("135");
        jj5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj5.setOpaque(true);

        jk5.setBackground(new java.awt.Color(255, 255, 255));
        jk5.setText("136");
        jk5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk5.setOpaque(true);

        jl5.setBackground(new java.awt.Color(102, 255, 102));
        jl5.setText("137");
        jl5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl5.setOpaque(true);

        jm5.setBackground(new java.awt.Color(255, 255, 255));
        jm5.setText("138");
        jm5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm5.setOpaque(true);

        jn5.setBackground(new java.awt.Color(102, 255, 102));
        jn5.setText("139");
        jn5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn5.setOpaque(true);

        jo5.setBackground(new java.awt.Color(255, 255, 255));
        jo5.setText("140");
        jo5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo5.setOpaque(true);

        jp5.setBackground(new java.awt.Color(102, 255, 102));
        jp5.setText("141");
        jp5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp5.setOpaque(true);

        jq5.setBackground(new java.awt.Color(255, 255, 255));
        jq5.setText("142");
        jq5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq5.setOpaque(true);

        js5.setBackground(new java.awt.Color(102, 255, 102));
        js5.setText("143");
        js5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js5.setOpaque(true);

        jf6.setBackground(new java.awt.Color(255, 255, 255));
        jf6.setText("156");
        jf6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf6.setOpaque(true);

        je6.setBackground(new java.awt.Color(102, 255, 102));
        je6.setText("155");
        je6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je6.setOpaque(true);

        jd6.setBackground(new java.awt.Color(255, 255, 255));
        jd6.setText("154");
        jd6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd6.setOpaque(true);

        jc6.setBackground(new java.awt.Color(102, 255, 102));
        jc6.setText("153");
        jc6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc6.setOpaque(true);

        jb6.setBackground(new java.awt.Color(255, 255, 255));
        jb6.setText("152");
        jb6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb6.setOpaque(true);

        ja6.setBackground(new java.awt.Color(102, 255, 102));
        ja6.setText("151");
        ja6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja6.setOpaque(true);

        jz5.setBackground(new java.awt.Color(255, 255, 255));
        jz5.setText("150");
        jz5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz5.setOpaque(true);

        jy5.setBackground(new java.awt.Color(102, 255, 102));
        jy5.setText("149");
        jy5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy5.setOpaque(true);

        jx5.setBackground(new java.awt.Color(255, 0, 0));
        jx5.setText("148");
        jx5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx5.setOpaque(true);

        jw5.setBackground(new java.awt.Color(102, 255, 102));
        jw5.setText("147");
        jw5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw5.setOpaque(true);

        jv5.setBackground(new java.awt.Color(0, 0, 255));
        jv5.setText("146");
        jv5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv5.setOpaque(true);

        ju5.setBackground(new java.awt.Color(102, 255, 102));
        ju5.setText("145");
        ju5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju5.setOpaque(true);

        jt5.setBackground(new java.awt.Color(255, 255, 255));
        jt5.setText("144");
        jt5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt5.setOpaque(true);

        jg6.setBackground(new java.awt.Color(102, 255, 102));
        jg6.setText("157");
        jg6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg6.setOpaque(true);

        jh6.setBackground(new java.awt.Color(255, 255, 255));
        jh6.setText("158");
        jh6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh6.setOpaque(true);

        ji6.setBackground(new java.awt.Color(102, 255, 102));
        ji6.setText("159");
        ji6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji6.setOpaque(true);

        jj6.setBackground(new java.awt.Color(255, 255, 255));
        jj6.setText("160");
        jj6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj6.setOpaque(true);

        jk6.setBackground(new java.awt.Color(102, 255, 102));
        jk6.setText("161");
        jk6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk6.setOpaque(true);

        jl6.setBackground(new java.awt.Color(0, 0, 255));
        jl6.setText("162");
        jl6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl6.setOpaque(true);

        jm6.setBackground(new java.awt.Color(102, 255, 102));
        jm6.setText("163");
        jm6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm6.setOpaque(true);

        jn6.setBackground(new java.awt.Color(255, 255, 255));
        jn6.setText("164");
        jn6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn6.setOpaque(true);

        jo6.setBackground(new java.awt.Color(102, 255, 102));
        jo6.setText("165");
        jo6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo6.setOpaque(true);

        jp6.setBackground(new java.awt.Color(255, 255, 255));
        jp6.setText("166");
        jp6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp6.setOpaque(true);

        jq6.setBackground(new java.awt.Color(102, 255, 102));
        jq6.setText("167");
        jq6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq6.setOpaque(true);

        js6.setBackground(new java.awt.Color(255, 255, 255));
        js6.setText("168");
        js6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js6.setOpaque(true);

        jt6.setBackground(new java.awt.Color(102, 255, 102));
        jt6.setText("169");
        jt6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt6.setOpaque(true);

        ju6.setBackground(new java.awt.Color(255, 255, 255));
        ju6.setText("170");
        ju6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju6.setOpaque(true);

        jv6.setBackground(new java.awt.Color(102, 255, 102));
        jv6.setText("171");
        jv6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv6.setOpaque(true);

        jw6.setBackground(new java.awt.Color(255, 0, 0));
        jw6.setText("172");
        jw6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw6.setOpaque(true);

        jx6.setBackground(new java.awt.Color(102, 255, 102));
        jx6.setText("173");
        jx6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx6.setOpaque(true);

        jy6.setBackground(new java.awt.Color(255, 255, 255));
        jy6.setText("174");
        jy6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy6.setOpaque(true);

        jz6.setBackground(new java.awt.Color(0, 0, 255));
        jz6.setText("175");
        jz6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz6.setOpaque(true);

        ja7.setBackground(new java.awt.Color(255, 255, 255));
        ja7.setText("176");
        ja7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja7.setOpaque(true);

        jb7.setBackground(new java.awt.Color(102, 255, 102));
        jb7.setText("177");
        jb7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb7.setOpaque(true);

        jc7.setBackground(new java.awt.Color(255, 255, 255));
        jc7.setText("178");
        jc7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc7.setOpaque(true);

        jd7.setBackground(new java.awt.Color(102, 255, 102));
        jd7.setText("179");
        jd7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd7.setOpaque(true);

        je7.setBackground(new java.awt.Color(255, 255, 255));
        je7.setText("180");
        je7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je7.setOpaque(true);

        jf7.setBackground(new java.awt.Color(102, 255, 102));
        jf7.setText("181");
        jf7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf7.setOpaque(true);

        jg7.setBackground(new java.awt.Color(255, 255, 255));
        jg7.setText("182");
        jg7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg7.setOpaque(true);

        jh7.setBackground(new java.awt.Color(102, 255, 102));
        jh7.setText("183");
        jh7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh7.setOpaque(true);

        ji7.setBackground(new java.awt.Color(255, 255, 255));
        ji7.setText("184");
        ji7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji7.setOpaque(true);

        jj7.setBackground(new java.awt.Color(102, 255, 102));
        jj7.setText("185");
        jj7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj7.setOpaque(true);

        jk7.setBackground(new java.awt.Color(255, 255, 255));
        jk7.setText("186");
        jk7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk7.setOpaque(true);

        jl7.setBackground(new java.awt.Color(102, 255, 102));
        jl7.setText("187");
        jl7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl7.setOpaque(true);

        jm7.setBackground(new java.awt.Color(255, 255, 255));
        jm7.setText("188");
        jm7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm7.setOpaque(true);

        jn7.setBackground(new java.awt.Color(102, 255, 102));
        jn7.setText("189");
        jn7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn7.setOpaque(true);

        jo7.setBackground(new java.awt.Color(255, 255, 255));
        jo7.setText("190");
        jo7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo7.setOpaque(true);

        jp7.setBackground(new java.awt.Color(102, 255, 102));
        jp7.setText("191");
        jp7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp7.setOpaque(true);

        jq7.setBackground(new java.awt.Color(255, 0, 0));
        jq7.setText("192");
        jq7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq7.setOpaque(true);

        js7.setBackground(new java.awt.Color(102, 255, 102));
        js7.setText("193");
        js7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js7.setOpaque(true);

        jt7.setBackground(new java.awt.Color(255, 255, 255));
        jt7.setText("194");
        jt7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt7.setOpaque(true);

        ju7.setBackground(new java.awt.Color(0, 0, 255));
        ju7.setText("195");
        ju7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju7.setOpaque(true);

        jv7.setBackground(new java.awt.Color(255, 255, 255));
        jv7.setText("196");
        jv7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv7.setOpaque(true);

        jw7.setBackground(new java.awt.Color(102, 255, 102));
        jw7.setText("197");
        jw7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw7.setOpaque(true);

        jx7.setBackground(new java.awt.Color(255, 255, 255));
        jx7.setText("198");
        jx7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx7.setOpaque(true);

        jy7.setBackground(new java.awt.Color(102, 255, 102));
        jy7.setText("199");
        jy7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy7.setOpaque(true);

        jz7.setBackground(new java.awt.Color(255, 255, 255));
        jz7.setText("200");
        jz7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz7.setOpaque(true);

        ja8.setBackground(new java.awt.Color(102, 255, 102));
        ja8.setText("201");
        ja8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ja8.setOpaque(true);

        jb8.setBackground(new java.awt.Color(255, 255, 255));
        jb8.setText("202");
        jb8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jb8.setOpaque(true);

        jc8.setBackground(new java.awt.Color(102, 255, 102));
        jc8.setText("203");
        jc8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jc8.setOpaque(true);

        jd8.setBackground(new java.awt.Color(255, 255, 255));
        jd8.setText("204");
        jd8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jd8.setOpaque(true);

        je8.setBackground(new java.awt.Color(102, 255, 102));
        je8.setText("205");
        je8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        je8.setOpaque(true);

        jf8.setBackground(new java.awt.Color(255, 255, 255));
        jf8.setText("206");
        jf8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jf8.setOpaque(true);

        jg8.setBackground(new java.awt.Color(255, 0, 0));
        jg8.setText("207");
        jg8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jg8.setOpaque(true);

        jh8.setBackground(new java.awt.Color(255, 255, 255));
        jh8.setText("208");
        jh8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jh8.setOpaque(true);

        ji8.setBackground(new java.awt.Color(0, 51, 255));
        ji8.setText("209");
        ji8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ji8.setOpaque(true);

        jj8.setBackground(new java.awt.Color(255, 255, 255));
        jj8.setText("210");
        jj8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jj8.setOpaque(true);

        jk8.setBackground(new java.awt.Color(102, 255, 102));
        jk8.setText("211");
        jk8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jk8.setOpaque(true);

        jl8.setBackground(new java.awt.Color(255, 255, 255));
        jl8.setText("212");
        jl8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl8.setOpaque(true);

        jm8.setBackground(new java.awt.Color(102, 255, 102));
        jm8.setText("213");
        jm8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jm8.setOpaque(true);

        jn8.setBackground(new java.awt.Color(255, 255, 255));
        jn8.setText("214");
        jn8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jn8.setOpaque(true);

        jo8.setBackground(new java.awt.Color(102, 255, 102));
        jo8.setText("215");
        jo8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jo8.setOpaque(true);

        jp8.setBackground(new java.awt.Color(255, 255, 255));
        jp8.setText("216");
        jp8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jp8.setOpaque(true);

        jq8.setBackground(new java.awt.Color(102, 255, 102));
        jq8.setText("217");
        jq8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jq8.setOpaque(true);

        js8.setBackground(new java.awt.Color(255, 255, 255));
        js8.setText("218");
        js8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        js8.setOpaque(true);

        jt8.setBackground(new java.awt.Color(102, 255, 102));
        jt8.setText("219");
        jt8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jt8.setOpaque(true);

        ju8.setBackground(new java.awt.Color(255, 255, 255));
        ju8.setText("220");
        ju8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ju8.setOpaque(true);

        jv8.setBackground(new java.awt.Color(0, 0, 255));
        jv8.setText("221");
        jv8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jv8.setOpaque(true);

        jw8.setBackground(new java.awt.Color(255, 255, 255));
        jw8.setText("222");
        jw8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jw8.setOpaque(true);

        jx8.setBackground(new java.awt.Color(102, 255, 102));
        jx8.setText("223");
        jx8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jx8.setOpaque(true);

        jy8.setBackground(new java.awt.Color(255, 255, 255));
        jy8.setText("224");
        jy8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jy8.setOpaque(true);

        jz8.setBackground(new java.awt.Color(102, 255, 102));
        jz8.setText("225");
        jz8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jz8.setOpaque(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jlPrimer2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPrimer2.setText("JUGADOR:");

        jlSegundo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSegundo2.setText("JUGADOR:");

        jlTercer2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlTercer2.setText("JUGADOR:");

        jlCuarto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCuarto2.setText("JUGADOR:");

        btnDado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDado.setText("DADO");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });

        lblDado.setBackground(new java.awt.Color(255, 255, 255));
        lblDado.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado.setText("1");
        lblDado.setOpaque(true);

        jbtnVolver1.setText("VOLVER");
        jbtnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlPrimer2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSegundo2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTercer2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCuarto2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbtnVolver1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnDado)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbtnVolver1)
                .addGap(51, 51, 51)
                .addComponent(jlPrimer2)
                .addGap(18, 18, 18)
                .addComponent(jlSegundo2)
                .addGap(18, 18, 18)
                .addComponent(jlTercer2)
                .addGap(18, 18, 18)
                .addComponent(jlCuarto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDado)
                .addGap(144, 144, 144))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jj8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ji8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jh8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jg8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jk8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jm8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jo8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jq8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(js8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ju8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jv8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jw8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jx8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jy8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jz8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jf8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(je8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jd8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jc8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ja8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jz7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jy7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jx7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jw7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jv7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(je7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jd7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jc7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jf7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jg7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jh7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ji7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jj7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jk7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jm7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jo7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jq7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(js7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ju7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ja7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jz6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jy6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jx6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jw6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jv6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ju6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(js6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jq6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ju4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(js4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jq4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jo4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jm4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jk4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jj4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ji4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jh4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jg4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jf4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(je1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jd1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ja1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(ja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(je, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ji, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(ju, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(js, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jf1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jj2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jk2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(ji2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jh2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jf2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(je2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jd2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ja2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jz1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jy1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jx1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jm2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jq2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(js2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ju2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jv2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jw2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jx2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ji1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jj1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jk1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jm1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jq1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jm3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jk3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jj3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ji3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jh3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jg3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jf3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(je3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jd3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jc3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ja3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jw1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ju1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jv1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jy2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jz2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jq3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(js3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ju3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jv3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jw3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jx3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jy3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jz3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ja4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jc4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jd4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(je4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jz5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jy5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jx5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jw5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jv5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ju5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(js5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jq5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jo5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jm5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jk5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jv4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jw4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jx4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jy4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jz4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ja5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jc5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jd5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(je5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jf5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jg5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jh5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ji5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jj5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(ja6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jc6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jd6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(je6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jf6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jg6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jh6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ji6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jj6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jk6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jm6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jo6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jo8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jv8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jj8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(je8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ja8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jv7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jj7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(je7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ja7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jv6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ja6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(je6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jj6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jk5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jv5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jv4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ja5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(je5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jj5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jf4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jj4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jv3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ja4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(je4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ja3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(je3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jj3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jk2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jv2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jv1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jw1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jx1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jy1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jz1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ja2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(je2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jj2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jf1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jj1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jk1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jq1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ju1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(js, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ju, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ja1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jd1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(je1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(je, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ji, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolverActionPerformed
        Ventana abrir= new Ventana();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnVolverActionPerformed

    private void jbtnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolver1ActionPerformed
        Ventana abrir= new Ventana();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnVolver1ActionPerformed

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed
        if (jugadores[turno].getPosicion() > 0) {
            lbs[jugadores[turno].getPosicion() - 1].setText("");
        }

        //dado
        juego.lanzarDado();
        int valorDado = juego.getDado();
        lblDado.setText(String.valueOf(valorDado));

        //Movimiento del jugador
        for (int i = 0; i < valorDado; i++) {
            if(juego.isEnJuego()==true){
                jugadores[turno].AumentarPosicion();
                comprobarGanador();
            }
        }
        //comprobar si ha caido en serpientes o escaleras
        comprobarSerpientes(jugadores[turno]);
        comprobarEscaleras(jugadores[turno]);


        // Cambiar posicion
        lbs[jugadores[turno].getPosicion() - 1].setText(" "+jugadores[turno].getFicha());

        // Cambia el turno al siguiente jugador
        turno = turno + 1;
        if (turno >= jugadores.length) {
            turno = 0;
        }
    }//GEN-LAST:event_btnDadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero15x15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDado;
    private javax.swing.JLabel jA;
    private javax.swing.JLabel jA1;
    private javax.swing.JLabel jA2;
    private javax.swing.JLabel jA3;
    private javax.swing.JLabel jA4;
    private javax.swing.JLabel jA5;
    private javax.swing.JLabel jA6;
    private javax.swing.JLabel jB;
    private javax.swing.JLabel jB1;
    private javax.swing.JLabel jB2;
    private javax.swing.JLabel jB3;
    private javax.swing.JLabel jB4;
    private javax.swing.JLabel jB5;
    private javax.swing.JLabel jB6;
    private javax.swing.JLabel jC;
    private javax.swing.JLabel jC1;
    private javax.swing.JLabel jC2;
    private javax.swing.JLabel jC3;
    private javax.swing.JLabel jC4;
    private javax.swing.JLabel jC5;
    private javax.swing.JLabel jC6;
    private javax.swing.JLabel jD;
    private javax.swing.JLabel jD1;
    private javax.swing.JLabel jD2;
    private javax.swing.JLabel jD3;
    private javax.swing.JLabel jD4;
    private javax.swing.JLabel jD5;
    private javax.swing.JLabel jD6;
    private javax.swing.JLabel jE;
    private javax.swing.JLabel jE1;
    private javax.swing.JLabel jE2;
    private javax.swing.JLabel jE3;
    private javax.swing.JLabel jE4;
    private javax.swing.JLabel jE5;
    private javax.swing.JLabel jE6;
    private javax.swing.JLabel jF;
    private javax.swing.JLabel jF1;
    private javax.swing.JLabel jF2;
    private javax.swing.JLabel jF3;
    private javax.swing.JLabel jF4;
    private javax.swing.JLabel jF5;
    private javax.swing.JLabel jF6;
    private javax.swing.JLabel jG;
    private javax.swing.JLabel jG1;
    private javax.swing.JLabel jG2;
    private javax.swing.JLabel jG3;
    private javax.swing.JLabel jG4;
    private javax.swing.JLabel jG5;
    private javax.swing.JLabel jG6;
    private javax.swing.JLabel jH;
    private javax.swing.JLabel jH1;
    private javax.swing.JLabel jH2;
    private javax.swing.JLabel jH3;
    private javax.swing.JLabel jH4;
    private javax.swing.JLabel jH5;
    private javax.swing.JLabel jH6;
    private javax.swing.JLabel jI;
    private javax.swing.JLabel jI1;
    private javax.swing.JLabel jI2;
    private javax.swing.JLabel jI3;
    private javax.swing.JLabel jI4;
    private javax.swing.JLabel jI5;
    private javax.swing.JLabel jI6;
    private javax.swing.JLabel jJ;
    private javax.swing.JLabel jJ1;
    private javax.swing.JLabel jJ2;
    private javax.swing.JLabel jJ3;
    private javax.swing.JLabel jJ4;
    private javax.swing.JLabel jJ5;
    private javax.swing.JLabel jJ6;
    private javax.swing.JLabel jK;
    private javax.swing.JLabel jK1;
    private javax.swing.JLabel jK2;
    private javax.swing.JLabel jK3;
    private javax.swing.JLabel jK4;
    private javax.swing.JLabel jK5;
    private javax.swing.JLabel jK6;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JLabel jL5;
    private javax.swing.JLabel jL6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jM;
    private javax.swing.JLabel jM1;
    private javax.swing.JLabel jM2;
    private javax.swing.JLabel jM3;
    private javax.swing.JLabel jM4;
    private javax.swing.JLabel jM5;
    private javax.swing.JLabel jM6;
    private javax.swing.JLabel jN;
    private javax.swing.JLabel jN1;
    private javax.swing.JLabel jN2;
    private javax.swing.JLabel jN3;
    private javax.swing.JLabel jN4;
    private javax.swing.JLabel jN5;
    private javax.swing.JLabel jN6;
    private javax.swing.JLabel jO;
    private javax.swing.JLabel jO1;
    private javax.swing.JLabel jO2;
    private javax.swing.JLabel jO3;
    private javax.swing.JLabel jO4;
    private javax.swing.JLabel jO5;
    private javax.swing.JLabel jO6;
    private javax.swing.JLabel jP;
    private javax.swing.JLabel jP1;
    private javax.swing.JLabel jP2;
    private javax.swing.JLabel jP3;
    private javax.swing.JLabel jP4;
    private javax.swing.JLabel jP5;
    private javax.swing.JLabel jP6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jQ;
    private javax.swing.JLabel jQ1;
    private javax.swing.JLabel jQ2;
    private javax.swing.JLabel jQ3;
    private javax.swing.JLabel jQ4;
    private javax.swing.JLabel jQ5;
    private javax.swing.JLabel jQ6;
    private javax.swing.JLabel jS;
    private javax.swing.JLabel jS1;
    private javax.swing.JLabel jS2;
    private javax.swing.JLabel jS3;
    private javax.swing.JLabel jS4;
    private javax.swing.JLabel jS5;
    private javax.swing.JLabel jS6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jT;
    private javax.swing.JLabel jT1;
    private javax.swing.JLabel jT2;
    private javax.swing.JLabel jT3;
    private javax.swing.JLabel jT4;
    private javax.swing.JLabel jT5;
    private javax.swing.JLabel jT6;
    private javax.swing.JLabel jU;
    private javax.swing.JLabel jU1;
    private javax.swing.JLabel jU2;
    private javax.swing.JLabel jU3;
    private javax.swing.JLabel jU4;
    private javax.swing.JLabel jU5;
    private javax.swing.JLabel jV;
    private javax.swing.JLabel jV1;
    private javax.swing.JLabel jV2;
    private javax.swing.JLabel jV3;
    private javax.swing.JLabel jV4;
    private javax.swing.JLabel jV5;
    private javax.swing.JLabel jW;
    private javax.swing.JLabel jW1;
    private javax.swing.JLabel jW2;
    private javax.swing.JLabel jW3;
    private javax.swing.JLabel jW4;
    private javax.swing.JLabel jW5;
    private javax.swing.JLabel jX;
    private javax.swing.JLabel jX1;
    private javax.swing.JLabel jX2;
    private javax.swing.JLabel jX3;
    private javax.swing.JLabel jX4;
    private javax.swing.JLabel jX5;
    private javax.swing.JLabel jY;
    private javax.swing.JLabel jY1;
    private javax.swing.JLabel jY2;
    private javax.swing.JLabel jY3;
    private javax.swing.JLabel jY4;
    private javax.swing.JLabel jY5;
    private javax.swing.JLabel jZ;
    private javax.swing.JLabel jZ1;
    private javax.swing.JLabel jZ2;
    private javax.swing.JLabel jZ3;
    private javax.swing.JLabel jZ4;
    private javax.swing.JLabel jZ5;
    private javax.swing.JLabel ja;
    private javax.swing.JLabel ja1;
    private javax.swing.JLabel ja2;
    private javax.swing.JLabel ja3;
    private javax.swing.JLabel ja4;
    private javax.swing.JLabel ja5;
    private javax.swing.JLabel ja6;
    private javax.swing.JLabel ja7;
    private javax.swing.JLabel ja8;
    private javax.swing.JLabel jb;
    private javax.swing.JLabel jb1;
    private javax.swing.JLabel jb2;
    private javax.swing.JLabel jb3;
    private javax.swing.JLabel jb4;
    private javax.swing.JLabel jb5;
    private javax.swing.JLabel jb6;
    private javax.swing.JLabel jb7;
    private javax.swing.JLabel jb8;
    private javax.swing.JButton jbtnDado;
    private javax.swing.JButton jbtnVolver;
    private javax.swing.JButton jbtnVolver1;
    private javax.swing.JLabel jc;
    private javax.swing.JLabel jc1;
    private javax.swing.JLabel jc2;
    private javax.swing.JLabel jc3;
    private javax.swing.JLabel jc4;
    private javax.swing.JLabel jc5;
    private javax.swing.JLabel jc6;
    private javax.swing.JLabel jc7;
    private javax.swing.JLabel jc8;
    private javax.swing.JLabel jd;
    private javax.swing.JLabel jd1;
    private javax.swing.JLabel jd2;
    private javax.swing.JLabel jd3;
    private javax.swing.JLabel jd4;
    private javax.swing.JLabel jd5;
    private javax.swing.JLabel jd6;
    private javax.swing.JLabel jd7;
    private javax.swing.JLabel jd8;
    private javax.swing.JLabel je;
    private javax.swing.JLabel je1;
    private javax.swing.JLabel je2;
    private javax.swing.JLabel je3;
    private javax.swing.JLabel je4;
    private javax.swing.JLabel je5;
    private javax.swing.JLabel je6;
    private javax.swing.JLabel je7;
    private javax.swing.JLabel je8;
    private javax.swing.JLabel jf;
    private javax.swing.JLabel jf1;
    private javax.swing.JLabel jf2;
    private javax.swing.JLabel jf3;
    private javax.swing.JLabel jf4;
    private javax.swing.JLabel jf5;
    private javax.swing.JLabel jf6;
    private javax.swing.JLabel jf7;
    private javax.swing.JLabel jf8;
    private javax.swing.JLabel jg;
    private javax.swing.JLabel jg1;
    private javax.swing.JLabel jg2;
    private javax.swing.JLabel jg3;
    private javax.swing.JLabel jg4;
    private javax.swing.JLabel jg5;
    private javax.swing.JLabel jg6;
    private javax.swing.JLabel jg7;
    private javax.swing.JLabel jg8;
    private javax.swing.JLabel jh;
    private javax.swing.JLabel jh1;
    private javax.swing.JLabel jh2;
    private javax.swing.JLabel jh3;
    private javax.swing.JLabel jh4;
    private javax.swing.JLabel jh5;
    private javax.swing.JLabel jh6;
    private javax.swing.JLabel jh7;
    private javax.swing.JLabel jh8;
    private javax.swing.JLabel ji;
    private javax.swing.JLabel ji1;
    private javax.swing.JLabel ji2;
    private javax.swing.JLabel ji3;
    private javax.swing.JLabel ji4;
    private javax.swing.JLabel ji5;
    private javax.swing.JLabel ji6;
    private javax.swing.JLabel ji7;
    private javax.swing.JLabel ji8;
    private javax.swing.JLabel jj;
    private javax.swing.JLabel jj1;
    private javax.swing.JLabel jj2;
    private javax.swing.JLabel jj3;
    private javax.swing.JLabel jj4;
    private javax.swing.JLabel jj5;
    private javax.swing.JLabel jj6;
    private javax.swing.JLabel jj7;
    private javax.swing.JLabel jj8;
    private javax.swing.JLabel jk;
    private javax.swing.JLabel jk1;
    private javax.swing.JLabel jk2;
    private javax.swing.JLabel jk3;
    private javax.swing.JLabel jk4;
    private javax.swing.JLabel jk5;
    private javax.swing.JLabel jk6;
    private javax.swing.JLabel jk7;
    private javax.swing.JLabel jk8;
    private javax.swing.JLabel jl;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jlCuarto;
    private javax.swing.JLabel jlCuarto2;
    private javax.swing.JLabel jlPrimer;
    private javax.swing.JLabel jlPrimer2;
    private javax.swing.JLabel jlSegundo;
    private javax.swing.JLabel jlSegundo2;
    private javax.swing.JLabel jlTercer;
    private javax.swing.JLabel jlTercer2;
    private javax.swing.JLabel jm;
    private javax.swing.JLabel jm1;
    private javax.swing.JLabel jm2;
    private javax.swing.JLabel jm3;
    private javax.swing.JLabel jm4;
    private javax.swing.JLabel jm5;
    private javax.swing.JLabel jm6;
    private javax.swing.JLabel jm7;
    private javax.swing.JLabel jm8;
    private javax.swing.JLabel jn;
    private javax.swing.JLabel jn1;
    private javax.swing.JLabel jn2;
    private javax.swing.JLabel jn3;
    private javax.swing.JLabel jn4;
    private javax.swing.JLabel jn5;
    private javax.swing.JLabel jn6;
    private javax.swing.JLabel jn7;
    private javax.swing.JLabel jn8;
    private javax.swing.JLabel jo;
    private javax.swing.JLabel jo1;
    private javax.swing.JLabel jo2;
    private javax.swing.JLabel jo3;
    private javax.swing.JLabel jo4;
    private javax.swing.JLabel jo5;
    private javax.swing.JLabel jo6;
    private javax.swing.JLabel jo7;
    private javax.swing.JLabel jo8;
    private javax.swing.JLabel jp;
    private javax.swing.JLabel jp1;
    private javax.swing.JLabel jp2;
    private javax.swing.JLabel jp3;
    private javax.swing.JLabel jp4;
    private javax.swing.JLabel jp5;
    private javax.swing.JLabel jp6;
    private javax.swing.JLabel jp7;
    private javax.swing.JLabel jp8;
    private javax.swing.JLabel jq;
    private javax.swing.JLabel jq1;
    private javax.swing.JLabel jq2;
    private javax.swing.JLabel jq3;
    private javax.swing.JLabel jq4;
    private javax.swing.JLabel jq5;
    private javax.swing.JLabel jq6;
    private javax.swing.JLabel jq7;
    private javax.swing.JLabel jq8;
    private javax.swing.JLabel js;
    private javax.swing.JLabel js1;
    private javax.swing.JLabel js2;
    private javax.swing.JLabel js3;
    private javax.swing.JLabel js4;
    private javax.swing.JLabel js5;
    private javax.swing.JLabel js6;
    private javax.swing.JLabel js7;
    private javax.swing.JLabel js8;
    private javax.swing.JLabel jt;
    private javax.swing.JLabel jt1;
    private javax.swing.JLabel jt2;
    private javax.swing.JLabel jt3;
    private javax.swing.JLabel jt4;
    private javax.swing.JLabel jt5;
    private javax.swing.JLabel jt6;
    private javax.swing.JLabel jt7;
    private javax.swing.JLabel jt8;
    private javax.swing.JLabel ju;
    private javax.swing.JLabel ju1;
    private javax.swing.JLabel ju2;
    private javax.swing.JLabel ju3;
    private javax.swing.JLabel ju4;
    private javax.swing.JLabel ju5;
    private javax.swing.JLabel ju6;
    private javax.swing.JLabel ju7;
    private javax.swing.JLabel ju8;
    private javax.swing.JLabel jv;
    private javax.swing.JLabel jv1;
    private javax.swing.JLabel jv2;
    private javax.swing.JLabel jv3;
    private javax.swing.JLabel jv4;
    private javax.swing.JLabel jv5;
    private javax.swing.JLabel jv6;
    private javax.swing.JLabel jv7;
    private javax.swing.JLabel jv8;
    private javax.swing.JLabel jw;
    private javax.swing.JLabel jw1;
    private javax.swing.JLabel jw2;
    private javax.swing.JLabel jw3;
    private javax.swing.JLabel jw4;
    private javax.swing.JLabel jw5;
    private javax.swing.JLabel jw6;
    private javax.swing.JLabel jw7;
    private javax.swing.JLabel jw8;
    private javax.swing.JLabel jx;
    private javax.swing.JLabel jx1;
    private javax.swing.JLabel jx2;
    private javax.swing.JLabel jx3;
    private javax.swing.JLabel jx4;
    private javax.swing.JLabel jx5;
    private javax.swing.JLabel jx6;
    private javax.swing.JLabel jx7;
    private javax.swing.JLabel jx8;
    private javax.swing.JLabel jy;
    private javax.swing.JLabel jy1;
    private javax.swing.JLabel jy2;
    private javax.swing.JLabel jy3;
    private javax.swing.JLabel jy4;
    private javax.swing.JLabel jy5;
    private javax.swing.JLabel jy6;
    private javax.swing.JLabel jy7;
    private javax.swing.JLabel jy8;
    private javax.swing.JLabel jz;
    private javax.swing.JLabel jz1;
    private javax.swing.JLabel jz2;
    private javax.swing.JLabel jz3;
    private javax.swing.JLabel jz4;
    private javax.swing.JLabel jz5;
    private javax.swing.JLabel jz6;
    private javax.swing.JLabel jz7;
    private javax.swing.JLabel jz8;
    private javax.swing.JLabel lblDado;
    // End of variables declaration//GEN-END:variables
}

package datos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import domain.Nodo;
import domain.NodoAscensor;
import domain.NodoEscalera;
import domain.Punto;

public class DatosMapa {
	
	private static Map<Punto, Nodo> mapa = new HashMap<Punto, Nodo>();
	private static Nodo posicion;
        private static boolean ascensoresFueraServicio;
      	private static boolean energiaElectrica;


	private static Nodo destino;
	private static List<Nodo> obstaculos= new ArrayList<Nodo>();
	private static List<Nodo> nodosSinLuz= new ArrayList<Nodo>();
        
        
    public static void setPosicion(Nodo posicion) {
        DatosMapa.posicion = posicion;
    }

    public static void setDestino(Nodo destino) {
        DatosMapa.destino = destino;
    }	
    private static void levantarDatos(){
    	
    	
        Punto puntoAscensor1Piso_114_84_1= new Punto(114,84,1);
        NodoAscensor ascensor1Piso_114_84_1= new NodoAscensor(puntoAscensor1Piso_114_84_1, "ASCENSOR1PISO");
        mapa.put(puntoAscensor1Piso_114_84_1, ascensor1Piso_114_84_1);
        
        Punto puntoAscensor2Piso_114_84_2= new Punto(114,84,2);
        NodoAscensor ascensor2Piso_114_84_2= new NodoAscensor(puntoAscensor2Piso_114_84_2, "ASCENSOR2PISO");
        mapa.put(puntoAscensor2Piso_114_84_2, ascensor2Piso_114_84_2);
        
        Punto puntoAscensor3Piso_114_84_3= new Punto(114,84,3);
        NodoAscensor ascensor3Piso_114_84_3= new NodoAscensor(puntoAscensor3Piso_114_84_3, "ASCENSOR3PISO");
        mapa.put(puntoAscensor3Piso_114_84_3, ascensor3Piso_114_84_3);
        
        Punto puntoEscaleraCercaAscensor_115_89_3= new Punto(115,89,3);
        NodoEscalera escaleraCercaAscensor_115_89_3= new NodoEscalera(puntoEscaleraCercaAscensor_115_89_3, "ESCALERACERCAASCENSOR");              
        mapa.put(puntoEscaleraCercaAscensor_115_89_3, escaleraCercaAscensor_115_89_3);
        
        Punto puntoEscaleraEntradaPosteriorAula21_114_89_2= new Punto(114,89,2);
        NodoEscalera escaleraEntradaPosteriorAula21_114_89_2= new NodoEscalera(puntoEscaleraEntradaPosteriorAula21_114_89_2, "ESCALERAENTRADAPOSTERIORAULA21");
        mapa.put(puntoEscaleraEntradaPosteriorAula21_114_89_2, escaleraEntradaPosteriorAula21_114_89_2);
        
        Punto puntoEscaleraEntradaPosteriorAula21_117_89_2= new Punto(117,89,2);
        NodoEscalera escaleraEntradaPosteriorAula21_117_89_2= new NodoEscalera(puntoEscaleraEntradaPosteriorAula21_117_89_2, "ESCALERAENTRADAPOSTERIORAULA21");
        mapa.put(puntoEscaleraEntradaPosteriorAula21_117_89_2, escaleraEntradaPosteriorAula21_117_89_2);
        
        Punto puntoEscaleraCercaJavalab_128_64_2= new Punto(128,64,2);
        NodoEscalera escaleraCercaJavalab_128_64_2= new NodoEscalera(puntoEscaleraCercaJavalab_128_64_2, "ESCALERACERCAJAVALAB");
        mapa.put(puntoEscaleraCercaJavalab_128_64_2, escaleraCercaJavalab_128_64_2);
        
        Punto puntoEscaleraCecovi_128_64_1= new Punto(128,64,1);
        NodoEscalera escaleraCecovi_128_64_1= new NodoEscalera(puntoEscaleraCecovi_128_64_1, "ESCALERACECOVI");
        mapa.put(puntoEscaleraCecovi_128_64_1, escaleraCecovi_128_64_1);
        
        Punto puntoEscaleraCecovi_122_64_1= new Punto(122,64,1);
        NodoEscalera escaleraCecovi_122_64_1= new NodoEscalera(puntoEscaleraCecovi_122_64_1, "ESCALERACECOVI");
        mapa.put(puntoEscaleraCecovi_122_64_1, escaleraCecovi_122_64_1);
        
        Punto puntoEscaleraSanitariosAula19_124_47_1= new Punto(124,47,1);
        NodoEscalera escaleraSanitariosAula19_124_47_1= new NodoEscalera(puntoEscaleraSanitariosAula19_124_47_1, "ESCALERASANITARIOSAULA19");
        mapa.put(puntoEscaleraSanitariosAula19_124_47_1, escaleraSanitariosAula19_124_47_1);
        
        Punto puntoEscaleraAula9_103_31_1= new Punto(103,31,1);
        NodoEscalera escaleraAula9_103_31_1= new NodoEscalera(puntoEscaleraAula9_103_31_1, "ESCALERAAULA9");
        mapa.put(puntoEscaleraAula9_103_31_1, escaleraAula9_103_31_1);
        
        Punto puntoEscaleraCercaAula20_113_60_1= new Punto(113,60,1);
        NodoEscalera escaleraCercaAula20_113_60_1= new NodoEscalera(puntoEscaleraCercaAula20_113_60_1, "ESCALERACERCAAULA20");
        mapa.put(puntoEscaleraCercaAula20_113_60_1, escaleraCercaAula20_113_60_1);
        
        Punto puntoEscaleraPatioPalmeras_117_89_0= new Punto(117,89,0);
        NodoEscalera escaleraPatioPalmeras_117_89_0= new NodoEscalera(puntoEscaleraPatioPalmeras_117_89_0, "ESCALERAPATIOPALMERAS");
        mapa.put(puntoEscaleraPatioPalmeras_117_89_0, escaleraPatioPalmeras_117_89_0);
        
        Punto puntoEscaleraDeptoIndustrial_117_89_1= new Punto(117,89,1);
        NodoEscalera escaleraDeptoIndustrial_117_89_1= new NodoEscalera(puntoEscaleraDeptoIndustrial_117_89_1, "ESCALERADEPTOINDUSTRIAL");
        mapa.put(puntoEscaleraDeptoIndustrial_117_89_1, escaleraDeptoIndustrial_117_89_1);
        
        Punto puntoEscaleraDeptoIndustrial_114_89_1= new Punto(114,89,1);
        NodoEscalera escaleraDeptoIndustrial_114_89_1= new NodoEscalera(puntoEscaleraDeptoIndustrial_114_89_1, "ESCALERADEPTOINDUSTRIAL");
        mapa.put(puntoEscaleraDeptoIndustrial_114_89_1, escaleraDeptoIndustrial_114_89_1);
        
        Punto puntoEscaleraSanitariosHallPlateaAlta_27_93_1= new Punto(27,93,1);
        NodoEscalera escaleraSanitariosHallPlateaAlta_27_93_1= new NodoEscalera(puntoEscaleraSanitariosHallPlateaAlta_27_93_1, "ESCALERASANITARIOSHALLPLATEAALTA");
        mapa.put(puntoEscaleraSanitariosHallPlateaAlta_27_93_1, escaleraSanitariosHallPlateaAlta_27_93_1);
        
        Punto puntoEscalera1PisoTorreAdm_67_91_1= new Punto(67,91,1);
        NodoEscalera escalera1PisoTorreAdm_67_91_1= new NodoEscalera(puntoEscalera1PisoTorreAdm_67_91_1, "ESCALERA1PISOTORREADM");
        mapa.put(puntoEscalera1PisoTorreAdm_67_91_1, escalera1PisoTorreAdm_67_91_1);
        
        Punto puntoIngreso_102_40_0= new Punto(102, 40, 0);
        Nodo ingreso_102_40_0 = new Nodo(puntoIngreso_102_40_0, "INGRESO");
        mapa.put(puntoIngreso_102_40_0, ingreso_102_40_0);
        
        Punto puntoFagdutPB_104_30_0= new Punto(104,30, 0);
        Nodo fagdut_104_30_0 = new Nodo(puntoFagdutPB_104_30_0, "FAGDUTPB");
        mapa.put(puntoFagdutPB_104_30_0, fagdut_104_30_0);
        
        Punto puntoAula1_110_30_0 = new Punto(110,30,0);
        Nodo aula1_110_30_0= new Nodo(puntoAula1_110_30_0,"AULA1");
        mapa.put(puntoAula1_110_30_0, aula1_110_30_0);
        
        Punto puntoHall_108_39_0= new Punto(108,39,0);
        Nodo hall_108_39_0= new Nodo(puntoHall_108_39_0, "HALL");
        
        mapa.put(puntoHall_108_39_0, hall_108_39_0);
        
        hall_108_39_0.setSur(ingreso_102_40_0);

        Punto puntoEscaleraHall_103_33_0= new Punto(103,33,0);
        NodoEscalera escaleraHall_103_33_0= new NodoEscalera(puntoEscaleraHall_103_33_0, "ESCALERAHALL");
        mapa.put(puntoEscaleraHall_103_33_0, escaleraHall_103_33_0);
        
        escaleraHall_103_33_0.setNoreste(fagdut_104_30_0);
        escaleraHall_103_33_0.setEscalera(escaleraAula9_103_31_1);
        
        
        
        aula1_110_30_0.setSur(fagdut_104_30_0);

        Punto puntoCercaLibreria_110_35_0= new Punto(110,35,0);
        Nodo cercaLibreria_110_35_0= new Nodo(puntoCercaLibreria_110_35_0, "CERCALIBRERIA");
        mapa.put(puntoCercaLibreria_110_35_0, cercaLibreria_110_35_0);
        
        cercaLibreria_110_35_0.setEste(aula1_110_30_0);
        cercaLibreria_110_35_0.setSuroeste(hall_108_39_0);
        cercaLibreria_110_35_0.setSureste(escaleraHall_103_33_0);
        
        Punto puntoLibreria_119_36_0= new Punto(119,36,0);
        Nodo libreria_119_36_0= new Nodo(puntoLibreria_119_36_0, "LIBRERIA");
        mapa.put(puntoLibreria_119_36_0, libreria_119_36_0);
        
        libreria_119_36_0.setSur(cercaLibreria_110_35_0);
        
        Punto puntoCEUT_119_33_0= new Punto(119,33,0);
        Nodo ceut_119_33_0= new Nodo(puntoCEUT_119_33_0, "CEUT");
        mapa.put(puntoCEUT_119_33_0, ceut_119_33_0);
        
        ceut_119_33_0.setOeste(libreria_119_36_0);
        ceut_119_33_0.setSureste(aula1_110_30_0);
        ceut_119_33_0.setSuroeste(cercaLibreria_110_35_0);
        
        Punto puntoAula2_122_33_0= new Punto(122,33,0);
        Nodo aula2_122_33_0= new Nodo(puntoAula2_122_33_0, "AULA2");
        mapa.put(puntoAula2_122_33_0, aula2_122_33_0);
        
        aula2_122_33_0.setSur(ceut_119_33_0);
        aula2_122_33_0.setSuroeste(libreria_119_36_0);
        
        Punto puntoAula3_128_33_0= new Punto(128,33,0);
        Nodo aula3_128_33_0= new Nodo(puntoAula3_128_33_0, "AULA3");
        mapa.put(puntoAula3_128_33_0, aula3_128_33_0);
        
        aula3_128_33_0.setSur(aula2_122_33_0);
        
        Punto puntoAula4_134_33_0= new Punto(134,33,0);
        Nodo aula4_134_33_0= new Nodo(puntoAula4_134_33_0, "AULA4");
        mapa.put(puntoAula4_134_33_0, aula4_134_33_0);
        
        aula4_134_33_0.setSur(aula3_128_33_0);
        
        Punto puntoAula5_140_33_0= new Punto(140,33,0);
        Nodo aula5_140_33_0= new Nodo(puntoAula5_140_33_0, "AULA5");
        mapa.put(puntoAula5_140_33_0, aula5_140_33_0);
        
        aula5_140_33_0.setSur(aula4_134_33_0);
        
        Punto puntoAula6_146_33_0= new Punto(146,33,0);
        Nodo aula6_146_33_0= new Nodo(puntoAula6_146_33_0, "AULA6");
        mapa.put(puntoAula6_146_33_0, aula6_146_33_0);
        
        aula6_146_33_0.setSur(aula5_140_33_0);
        
        Punto puntoAulaInformatica_152_33_0= new Punto(152,33,0);
        Nodo aulaInformatica_152_33_0= new Nodo(puntoAulaInformatica_152_33_0, "AULAINFORMATICA");
        mapa.put(puntoAulaInformatica_152_33_0, aulaInformatica_152_33_0);
        
        aulaInformatica_152_33_0.setSur(aula6_146_33_0);
        
        Punto puntoLabQuimica_158_34_0= new Punto(158,34,0);
        Nodo labQuimica_158_34_0= new Nodo(puntoLabQuimica_158_34_0, "LABQUIMICA");
        mapa.put(puntoLabQuimica_158_34_0, labQuimica_158_34_0);
        
        labQuimica_158_34_0.setSur(aulaInformatica_152_33_0);
        
        Punto puntoLabFisica_158_38_0= new Punto(158,38,0);
        Nodo labFisica_158_38_0= new Nodo(puntoLabFisica_158_38_0, "LABFISICA");
        mapa.put(puntoLabFisica_158_38_0, labFisica_158_38_0);
        
        labFisica_158_38_0.setEste(labQuimica_158_34_0);
        labFisica_158_38_0.setSureste(aulaInformatica_152_33_0);
        
        Punto puntoLabFluidica_143_37_0= new Punto(143,37,0);
        Nodo labFluidica_143_37_0= new Nodo(puntoLabFluidica_143_37_0, "LABFLUIDICA");
        mapa.put(puntoLabFluidica_143_37_0, labFluidica_143_37_0);
        
        labFluidica_143_37_0.setEste(aula5_140_33_0);
        labFluidica_143_37_0.setNoreste(aula6_146_33_0);
        
        Punto puntoLabMetales_142_42_0= new Punto(142,42,0);
        Nodo labMetales_142_42_0= new Nodo(puntoLabMetales_142_42_0, "LABMETALES");
        mapa.put(puntoLabMetales_142_42_0, labMetales_142_42_0);
        
        labMetales_142_42_0.setEste(labFluidica_143_37_0);
        
        Punto puntoLaboratorioFlow_138_48_0= new Punto(138,48,0);
        Nodo laboratorioFlow_138_48_0= new Nodo(puntoLaboratorioFlow_138_48_0, "LABORATORIOFLOW");
        mapa.put(puntoLaboratorioFlow_138_48_0, laboratorioFlow_138_48_0);
        
        laboratorioFlow_138_48_0.setNoreste(labMetales_142_42_0);
        
        Punto puntoSanitariosHall_127_41_0= new Punto(127,41,0);
        Nodo sanitariosHall_127_41_0= new Nodo(puntoSanitariosHall_127_41_0, "SANITARIOSHALL");
        mapa.put(puntoSanitariosHall_127_41_0, sanitariosHall_127_41_0);
        
        Punto puntoEscaleraBanosHall_115_47_0= new Punto(115,47,0);
        NodoEscalera escaleraBanosHall_115_47_0= new NodoEscalera(puntoEscaleraBanosHall_115_47_0, "ESCALERABANOSHALL");
        mapa.put(puntoEscaleraBanosHall_115_47_0, escaleraBanosHall_115_47_0);
        
        Punto puntoPasilloASanitariosHall_123_45_0= new Punto(123,45,0);
        Nodo pasilloASanitariosHall_123_45_0= new Nodo(puntoPasilloASanitariosHall_123_45_0, "PASILLOASANITARIOSHALL");
        mapa.put(puntoPasilloASanitariosHall_123_45_0, pasilloASanitariosHall_123_45_0);
        
        pasilloASanitariosHall_123_45_0.setNoreste(sanitariosHall_127_41_0);
        pasilloASanitariosHall_123_45_0.setNoroeste(laboratorioFlow_138_48_0);
        pasilloASanitariosHall_123_45_0.setSuroeste(escaleraBanosHall_115_47_0);

        escaleraBanosHall_115_47_0.setEscalera(escaleraSanitariosAula19_124_47_1);
        
        Punto puntoGiedi_114_43_0= new Punto(114,43,0);
        Nodo giedi_114_43_0= new Nodo(puntoGiedi_114_43_0, "GIEDI");
        mapa.put(puntoGiedi_114_43_0, giedi_114_43_0);
        
        giedi_114_43_0.setSureste(hall_108_39_0);
        
        Punto puntoInformes_110_44_0= new Punto(110,44,0);
        Nodo informes_110_44_0= new Nodo(puntoInformes_110_44_0, "INFORMES");
        mapa.put(puntoInformes_110_44_0, informes_110_44_0);
        
        informes_110_44_0.setNoroeste(escaleraBanosHall_115_47_0);
        informes_110_44_0.setNoreste(giedi_114_43_0);
        informes_110_44_0.setNorte(pasilloASanitariosHall_123_45_0);
        
        Punto puntoEscaleraDeptoMecanica_113_61_0= new Punto(113,61,0);
        NodoEscalera escaleraDeptoMecanica_113_61_0= new NodoEscalera(puntoEscaleraDeptoMecanica_113_61_0, "ESCALERADEPTOMECANICA");
        mapa.put(puntoEscaleraDeptoMecanica_113_61_0, escaleraDeptoMecanica_113_61_0);
        
        Punto puntoDeptoMecanica_110_54_0= new Punto(110,54,0);
        Nodo deptoMecanica_110_54_0= new Nodo(puntoDeptoMecanica_110_54_0, "DEPTOMECANICA");
        mapa.put(puntoDeptoMecanica_110_54_0, deptoMecanica_110_54_0);
        
        deptoMecanica_110_54_0.setEste(informes_110_44_0);
        deptoMecanica_110_54_0.setNoreste(escaleraBanosHall_115_47_0);
        
        Punto puntoCantina_83_34_0= new Punto(83,34,0);
        Nodo cantina_83_34_0= new Nodo(puntoCantina_83_34_0, "CANTINA");
        mapa.put(puntoCantina_83_34_0, cantina_83_34_0);

        cantina_83_34_0.setNoroeste(ingreso_102_40_0);
        
        Punto puntoCentroEstudiantes_84_41_0= new Punto(84,41,0);
        Nodo centroEstudiantes_84_41_0= new Nodo(puntoCentroEstudiantes_84_41_0, "CENTROESTUDIANTES");
        mapa.put(puntoCentroEstudiantes_84_41_0, centroEstudiantes_84_41_0);
        
        centroEstudiantes_84_41_0.setEste(cantina_83_34_0);
        centroEstudiantes_84_41_0.setNorte(ingreso_102_40_0);
        
        Punto puntoBiblioteca_82_47_0= new Punto(82,47,0);
        Nodo biblioteca_82_47_0= new Nodo(puntoBiblioteca_82_47_0, "BIBLIOTECA");
        mapa.put(puntoBiblioteca_82_47_0, biblioteca_82_47_0);
        
        biblioteca_82_47_0.setEste(centroEstudiantes_84_41_0);
        biblioteca_82_47_0.setNoreste(ingreso_102_40_0);
        
        Punto puntoDirAcademica_82_65_0= new Punto(82,65,0);
        Nodo dirAcademica_82_65_0= new Nodo(puntoDirAcademica_82_65_0, "DIRACADEMICA");
        mapa.put(puntoDirAcademica_82_65_0, dirAcademica_82_65_0);
        
        dirAcademica_82_65_0.setEste(biblioteca_82_47_0);
        
        Punto puntoAlumnado_82_68_0= new Punto(82,68,0);
        Nodo alumnado_82_68_0= new Nodo(puntoAlumnado_82_68_0, "ALUMNADO");
        mapa.put(puntoAlumnado_82_68_0, alumnado_82_68_0);
        
        alumnado_82_68_0.setEste(dirAcademica_82_65_0);
        
        Punto puntoIngresoTorreAdm_82_86_0= new Punto(82,86,0);
        Nodo ingresoTorreAdm_82_86_0= new Nodo(puntoIngresoTorreAdm_82_86_0, "INGRESOTORREADM");
        mapa.put(puntoIngresoTorreAdm_82_86_0, ingresoTorreAdm_82_86_0);
        
        ingresoTorreAdm_82_86_0.setEste(alumnado_82_68_0);
        
        Punto puntoPasilloAEstadio_74_86_0= new Punto(74,86,0);
        Nodo pasilloAEstadio_74_86_0= new Nodo(puntoPasilloAEstadio_74_86_0, "PASILLOAESTADIO");
        mapa.put(puntoPasilloAEstadio_74_86_0, pasilloAEstadio_74_86_0);
        
        pasilloAEstadio_74_86_0.setNorte(ingresoTorreAdm_82_86_0);
        
        Punto puntoOficinaGraduados_70_84_0= new Punto(70,84,0);
        Nodo oficinaGraduados_70_84_0= new Nodo(puntoOficinaGraduados_70_84_0, "OFICINAGRADUADOS");
        mapa.put(puntoOficinaGraduados_70_84_0, oficinaGraduados_70_84_0);
        
        oficinaGraduados_70_84_0.setNoroeste(pasilloAEstadio_74_86_0);
        
        Punto puntoEntrePasilloEstadioYEscaleraTorreAdm_69_88_0= new Punto(69,88,0);
        Nodo entrePasilloEstadioYEscaleraTorreAdm_69_88_0= new Nodo(puntoEntrePasilloEstadioYEscaleraTorreAdm_69_88_0, "PUNTOENTREPASILLOESTADIOYESCALERATORREADM");
        mapa.put(puntoEntrePasilloEstadioYEscaleraTorreAdm_69_88_0, entrePasilloEstadioYEscaleraTorreAdm_69_88_0);
        
        entrePasilloEstadioYEscaleraTorreAdm_69_88_0.setNoreste(pasilloAEstadio_74_86_0);
        
        Punto puntoPasilloAEstadio_66_86_0= new Punto(66,86,0);
        Nodo pasilloAEstadio_66_86_0= new Nodo(puntoPasilloAEstadio_66_86_0, "PASILLOAESTADIO");
        mapa.put(puntoPasilloAEstadio_66_86_0, pasilloAEstadio_66_86_0);
        
        pasilloAEstadio_66_86_0.setNoroeste(entrePasilloEstadioYEscaleraTorreAdm_69_88_0);
        pasilloAEstadio_66_86_0.setNoreste(oficinaGraduados_70_84_0);
        pasilloAEstadio_66_86_0.setNorte(pasilloAEstadio_74_86_0);
        
        Punto puntoEscaleraPBTorreAdm_68_89_0= new Punto(68,89,0);
        NodoEscalera escaleraPBTorreAdm_68_89_0= new NodoEscalera(puntoEscaleraPBTorreAdm_68_89_0, "ESCALERAPBTORREADM");
        mapa.put(puntoEscaleraPBTorreAdm_68_89_0, escaleraPBTorreAdm_68_89_0);
        
        escaleraPBTorreAdm_68_89_0.setEscalera(escalera1PisoTorreAdm_67_91_1);
        escaleraPBTorreAdm_68_89_0.setNoreste(entrePasilloEstadioYEscaleraTorreAdm_69_88_0);
        
        Punto puntoPasilloAEstadio1_45_86_0= new Punto(45,86,0);
        Nodo pasilloAEstadio1_45_86_0= new Nodo(puntoPasilloAEstadio1_45_86_0, "PASILLOAESTADIO1");
        mapa.put(puntoPasilloAEstadio1_45_86_0, pasilloAEstadio1_45_86_0);
        
        pasilloAEstadio1_45_86_0.setNorte(pasilloAEstadio_66_86_0);
        
        Punto puntoEntreHallEstadioYVestuarios_37_86_0= new Punto(37,86,0);
        Nodo entreHallEstadioYVestuarios_37_86_0= new Nodo(puntoEntreHallEstadioYVestuarios_37_86_0, "ENTREHALLESTADIOYVESTUARIOS");
        mapa.put(puntoEntreHallEstadioYVestuarios_37_86_0, entreHallEstadioYVestuarios_37_86_0);
        
        entreHallEstadioYVestuarios_37_86_0.setNorte(pasilloAEstadio1_45_86_0);
        
        Punto puntoIngresoTribunaOeste_35_90_0= new Punto(35,90,0);
        Nodo ingresoTribunaOeste_35_90_0= new Nodo(puntoIngresoTribunaOeste_35_90_0, "INGRESOTRIBUNAOESTE");
        mapa.put(puntoIngresoTribunaOeste_35_90_0, ingresoTribunaOeste_35_90_0);
        
        ingresoTribunaOeste_35_90_0.setNoreste(entreHallEstadioYVestuarios_37_86_0);
        
        Punto puntoEscaleraIngresoTribunaOeste_27_91_0= new Punto(27,91,0);
        NodoEscalera escaleraIngresoTribunaOeste_27_91_0= new NodoEscalera(puntoEscaleraIngresoTribunaOeste_27_91_0, "ESCALERAINGRESOTRIBUNAOESTE");
        mapa.put(puntoEscaleraIngresoTribunaOeste_27_91_0, escaleraIngresoTribunaOeste_27_91_0);
        
        escaleraIngresoTribunaOeste_27_91_0.setEscalera(escaleraSanitariosHallPlateaAlta_27_93_1);
        escaleraIngresoTribunaOeste_27_91_0.setNorte(ingresoTribunaOeste_35_90_0);
        
        Punto puntoHallEstadio_33_77_0= new Punto(33,77,0);
        Nodo hallEstadio_33_77_0= new Nodo(puntoHallEstadio_33_77_0, "HALLESTADIO");
        mapa.put(puntoHallEstadio_33_77_0, hallEstadio_33_77_0);
        
        hallEstadio_33_77_0.setOeste(ingresoTribunaOeste_35_90_0);
        hallEstadio_33_77_0.setNoroeste(entreHallEstadioYVestuarios_37_86_0);
        
        Punto puntoPasilloDeptoMecanica_111_61_0= new Punto(111,61,0);
        Nodo pasilloDeptoMecanica_111_61_0= new Nodo(puntoPasilloDeptoMecanica_111_61_0, "PASILLODEPTOMECANICA");
        mapa.put(puntoPasilloDeptoMecanica_111_61_0, pasilloDeptoMecanica_111_61_0);
        
        pasilloDeptoMecanica_111_61_0.setNorte(escaleraDeptoMecanica_113_61_0);
        pasilloDeptoMecanica_111_61_0.setEste(deptoMecanica_110_54_0);
        
        escaleraDeptoMecanica_113_61_0.setEscalera(escaleraCercaAula20_113_60_1);
        
        Punto puntoPasilloPatioPalmeras_111_63_0= new Punto(111,63,0);
        Nodo pasilloPatioPalmeras_111_63_0= new Nodo(puntoPasilloPatioPalmeras_111_63_0, "PASILLOPATIOPALMERAS");
        mapa.put(puntoPasilloPatioPalmeras_111_63_0, pasilloPatioPalmeras_111_63_0);
        
        pasilloPatioPalmeras_111_63_0.setSur(pasilloDeptoMecanica_111_61_0);
        
        Punto puntoEntradaDeptoElectrica_118_63_0= new Punto(118,63,0);
        Nodo entradaDeptoElectrica_118_63_0= new Nodo(puntoEntradaDeptoElectrica_118_63_0, "ENTRADADEPTOELECTRICA");
        mapa.put(puntoEntradaDeptoElectrica_118_63_0, entradaDeptoElectrica_118_63_0);
        
        entradaDeptoElectrica_118_63_0.setSur(pasilloPatioPalmeras_111_63_0);
        
        Punto puntoEscaleraDeptoElectrica_121_63_0= new Punto(121,63,0);
        NodoEscalera escaleraDeptoElectrica_121_63_0= new NodoEscalera(puntoEscaleraDeptoElectrica_121_63_0, "ESCALERADEPTOELECTRICA");
        mapa.put(puntoEscaleraDeptoElectrica_121_63_0, escaleraDeptoElectrica_121_63_0);
        
        escaleraDeptoElectrica_121_63_0.setEscalera(escaleraCecovi_128_64_1);
        escaleraDeptoElectrica_121_63_0.setSur(entradaDeptoElectrica_118_63_0);
        
        Punto puntoDeptoElectrica_121_66_0= new Punto(121,66,0);
        Nodo deptoElectrica_121_66_0= new Nodo(puntoDeptoElectrica_121_66_0, "DEPTOELECTRICA");
        mapa.put(puntoDeptoElectrica_121_66_0, deptoElectrica_121_66_0);
        
        deptoElectrica_121_66_0.setSureste(entradaDeptoElectrica_118_63_0);
        deptoElectrica_121_66_0.setEste(escaleraDeptoElectrica_121_63_0);
        
        Punto puntoPasilloPatioPalmeras1_111_72_0= new Punto(111,72,0);
        Nodo pasilloPatioPalmeras1_111_72_0= new Nodo(puntoPasilloPatioPalmeras1_111_72_0, "PASILLOPATIOPALMERAS1");
        mapa.put(puntoPasilloPatioPalmeras1_111_72_0, pasilloPatioPalmeras1_111_72_0);
        
        pasilloPatioPalmeras1_111_72_0.setEste(pasilloPatioPalmeras_111_63_0);
        
        Punto puntoPasilloPatioPalmeras2_111_84_0= new Punto(111,84,0);
        Nodo pasilloPatioPalmeras2_111_84_0= new Nodo(puntoPasilloPatioPalmeras2_111_84_0, "PASILLOPATIOPALMERAS2");
        mapa.put(puntoPasilloPatioPalmeras2_111_84_0, pasilloPatioPalmeras2_111_84_0);
        
        pasilloPatioPalmeras2_111_84_0.setEste(pasilloPatioPalmeras1_111_72_0);
        
        Punto puntoPasilloPatioPalmeras3_117_87_0= new Punto(117,87,0);
        Nodo pasilloPatioPalmeras3_117_87_0= new Nodo(puntoPasilloPatioPalmeras3_117_87_0, "PASILLOPATIOPALMERAS3");
        mapa.put(puntoPasilloPatioPalmeras3_117_87_0, pasilloPatioPalmeras3_117_87_0);
        
        pasilloPatioPalmeras3_117_87_0.setOeste(escaleraPatioPalmeras_117_89_0);
        
        Punto puntoAscensorPB_115_84_0= new Punto(115,84,0);
        NodoAscensor ascensorPB_115_84_0= new NodoAscensor(puntoAscensorPB_115_84_0, "ASCENSORPB");
        mapa.put(puntoAscensorPB_115_84_0, ascensorPB_115_84_0);
        
        escaleraPatioPalmeras_117_89_0.setEscalera(escaleraDeptoIndustrial_114_89_1);

        ascensorPB_115_84_0.setSur(pasilloPatioPalmeras2_111_84_0);
        ascensorPB_115_84_0.setNoroeste(pasilloPatioPalmeras3_117_87_0);
        
        Punto puntoEntradaDeptoElectrica2_118_87_0= new Punto(118,87,0);
        Nodo entradaDeptoElectrica2_118_87_0= new Nodo(puntoEntradaDeptoElectrica2_118_87_0, "ENTRADADEPTOELECTRICA2");
        mapa.put(puntoEntradaDeptoElectrica2_118_87_0, entradaDeptoElectrica2_118_87_0);
        
        entradaDeptoElectrica2_118_87_0.setSur(pasilloPatioPalmeras3_117_87_0);
        entradaDeptoElectrica2_118_87_0.setSuroeste(escaleraPatioPalmeras_117_89_0);
        
        Punto puntoAulaD006_122_84_0= new Punto(122,84,0);
        Nodo aulaD006_122_84_0= new Nodo(puntoAulaD006_122_84_0, "AULAD006");
        mapa.put(puntoAulaD006_122_84_0, aulaD006_122_84_0);
        
        aulaD006_122_84_0.setSuroeste(entradaDeptoElectrica2_118_87_0);
        
        Punto puntoAulaD007_124_84_0= new Punto(124,84,0);
        Nodo aulaD007_124_84_0= new Nodo(puntoAulaD007_124_84_0, "AULAD007");
        mapa.put(puntoAulaD007_124_84_0, aulaD007_124_84_0);
        
        aulaD007_124_84_0.setSur(aulaD006_122_84_0);
        
        Punto puntoAula9_104_30_1= new Punto(104,30,1);
        Nodo aula9_104_30_1= new Nodo(puntoAula9_104_30_1, "AULA9");
        mapa.put(puntoAula9_104_30_1, aula9_104_30_1);
        
        aula9_104_30_1.setSur(escaleraAula9_103_31_1);

        Punto puntoAula10_110_30_1= new Punto(110,30,1);
        Nodo aula10_110_30_1= new Nodo(puntoAula10_110_30_1, "AULA10");
        mapa.put(puntoAula10_110_30_1, aula10_110_30_1);
        
        aula10_110_30_1.setSur(aula9_104_30_1);

        Punto puntoPuntoCercaAula10_119_30_1= new Punto(119,30,1);
        Nodo puntoCercaAula10_119_30_1= new Nodo(puntoPuntoCercaAula10_119_30_1, "PUNTOCERCAAULA10");
        mapa.put(puntoPuntoCercaAula10_119_30_1, puntoCercaAula10_119_30_1);
        
        puntoCercaAula10_119_30_1.setSur(aula10_110_30_1);

        Punto puntoPuntoCercaInformaticaBasicas_119_34_1= new Punto(119,34,1);
        Nodo puntoCercaInformaticaBasicas_119_34_1= new Nodo(puntoPuntoCercaInformaticaBasicas_119_34_1, "PUNTOCERCAINFORMATICABASICAS");
        mapa.put(puntoPuntoCercaInformaticaBasicas_119_34_1, puntoCercaInformaticaBasicas_119_34_1);
        
        puntoCercaInformaticaBasicas_119_34_1.setEste(puntoCercaAula10_119_30_1);

        Punto puntoSalaInformaticaBasicas_120_36_0= new Punto(120,36,1);
        Nodo salaInformaticaBasicas_120_36_0= new Nodo(puntoSalaInformaticaBasicas_120_36_0, "SALAINFORMATICABASICAS");
        mapa.put(puntoSalaInformaticaBasicas_120_36_0, salaInformaticaBasicas_120_36_0);
        
        salaInformaticaBasicas_120_36_0.setEste(puntoCercaInformaticaBasicas_119_34_1);

        Punto puntoAula11_122_33_1= new Punto(122,33,1);
        Nodo aula11_122_33_1= new Nodo(puntoAula11_122_33_1, "AULA11");
        mapa.put(puntoAula11_122_33_1, aula11_122_33_1);
        
        aula11_122_33_1.setSur(puntoCercaInformaticaBasicas_119_34_1);
        aula11_122_33_1.setSureste(salaInformaticaBasicas_120_36_0);

        Punto puntoAula12_128_33_1= new Punto(128,33,1);
        Nodo aula12_128_33_1= new Nodo(puntoAula12_128_33_1, "AULA12");
        mapa.put(puntoAula12_128_33_1, aula12_128_33_1);
        
        aula12_128_33_1.setSur(aula11_122_33_1);

        Punto puntoPuntoCercaAula12_131_35_1= new Punto(131,35,1);
        Nodo puntoCercaAula12_131_35_1= new Nodo(puntoPuntoCercaAula12_131_35_1, "PUNTOCERCAAULA12");
        mapa.put(puntoPuntoCercaAula12_131_35_1, puntoCercaAula12_131_35_1);
        
        puntoCercaAula12_131_35_1.setSureste(aula12_128_33_1);

        Punto puntoAula13_134_33_1= new Punto(134,33,1);
        Nodo aula13_134_33_1= new Nodo(puntoAula13_134_33_1, "AULA13");
        mapa.put(puntoAula13_134_33_1, aula13_134_33_1);
        
        aula13_134_33_1.setSur(aula12_128_33_1);
        aula13_134_33_1.setSuroeste(puntoCercaAula12_131_35_1);

        Punto puntoAula14_140_33_1= new Punto(140,33,1);
        Nodo aula14_140_33_1= new Nodo(puntoAula14_140_33_1, "AULA14");
        mapa.put(puntoAula14_140_33_1, aula14_140_33_1);
        
        aula14_140_33_1.setSur(aula13_134_33_1);

        Punto puntoAula15_146_33_1= new Punto(146,33,1);
        Nodo aula15_146_33_1= new Nodo(puntoAula15_146_33_1, "AULA15");
        mapa.put(puntoAula15_146_33_1, aula15_146_33_1);
        
        aula15_146_33_1.setSur(aula14_140_33_1);

        Punto puntoAula16_152_33_1= new Punto(152,33,1);
        Nodo aula16_152_33_1= new Nodo(puntoAula16_152_33_1, "AULA16");
        mapa.put(puntoAula16_152_33_1, aula16_152_33_1);
        
        aula16_152_33_1.setSur(aula15_146_33_1);

        Punto puntoAula17_158_34_1= new Punto(158,34,1);
        Nodo aula17_158_34_1= new Nodo(puntoAula17_158_34_1, "AULA17");
        mapa.put(puntoAula17_158_34_1, aula17_158_34_1);
        
        aula17_158_34_1.setSureste(aula16_152_33_1);

        Punto puntoAula18_158_38_1= new Punto(158,38,1);
        Nodo aula18_158_38_1= new Nodo(puntoAula18_158_38_1, "AULA18");
        mapa.put(puntoAula18_158_38_1, aula18_158_38_1);
        
        aula18_158_38_1.setEste(aula17_158_34_1);

        Punto puntoPuntoCercaAula14_142_35_1= new Punto(142,35,1);
        Nodo puntoCercaAula14_142_35_1= new Nodo(puntoPuntoCercaAula14_142_35_1, "PUNTOCERCAAULA14");
        mapa.put(puntoPuntoCercaAula14_142_35_1, puntoCercaAula14_142_35_1);
        
        puntoCercaAula14_142_35_1.setSur(puntoCercaAula12_131_35_1);
        puntoCercaAula14_142_35_1.setNorte(aula17_158_34_1);
        puntoCercaAula14_142_35_1.setNoreste(aula15_146_33_1);
        puntoCercaAula14_142_35_1.setSureste(aula14_140_33_1);

        Punto puntoAula19_141_37_1= new Punto(141,37,1);
        Nodo aula19_141_37_1= new Nodo(puntoAula19_141_37_1, "AULA19");
        mapa.put(puntoAula19_141_37_1, aula19_141_37_1);
        
        aula19_141_37_1.setNoreste(puntoCercaAula14_142_35_1);

        Punto puntoPuntoCercaAula19_142_44_1= new Punto(142,44,1);
        Nodo puntoCercaAula19_142_44_1= new Nodo(puntoPuntoCercaAula19_142_44_1, "PUNTOCERCAAULA19");
        mapa.put(puntoPuntoCercaAula19_142_44_1, puntoCercaAula19_142_44_1);
        
        puntoCercaAula19_142_44_1.setEste(puntoCercaAula14_142_35_1);
        puntoCercaAula19_142_44_1.setSureste(aula19_141_37_1);

        Punto puntoPuntoCercaAula19_136_48_1= new Punto(136,48,1);
        Nodo puntoCercaAula19_136_48_1= new Nodo(puntoPuntoCercaAula19_136_48_1, "PUNTOCERCAAULA19");
        mapa.put(puntoPuntoCercaAula19_136_48_1, puntoCercaAula19_136_48_1);
        
        puntoCercaAula19_136_48_1.setNoroeste(puntoCercaAula19_142_44_1);

        Punto puntoPuntoCercaAula19_127_48_1= new Punto(127,48,1);
        Nodo puntoCercaAula19_127_48_1= new Nodo(puntoPuntoCercaAula19_127_48_1, "PUNTOCERCAAULA19");
        mapa.put(puntoPuntoCercaAula19_127_48_1, puntoCercaAula19_127_48_1);
        
        puntoCercaAula19_127_48_1.setSur(escaleraSanitariosAula19_124_47_1);
        puntoCercaAula19_127_48_1.setNorte(puntoCercaAula19_136_48_1);

        Punto puntoSanitariosCercaAula19_127_42_0= new Punto(127,42,1);
        Nodo sanitariosCercaAula19_127_42_0= new Nodo(puntoSanitariosCercaAula19_127_42_0, "SANITARIOSCERCAAULA19");
        mapa.put(puntoSanitariosCercaAula19_127_42_0, sanitariosCercaAula19_127_42_0);
        
        sanitariosCercaAula19_127_42_0.setSuroeste(escaleraSanitariosAula19_124_47_1);
        sanitariosCercaAula19_127_42_0.setOeste(puntoCercaAula19_127_48_1);

        Punto puntoPuntoPasilloCercaGimni_136_54_1= new Punto(136,54,1);
        Nodo puntoPasilloCercaGimni_136_54_1= new Nodo(puntoPuntoPasilloCercaGimni_136_54_1, "PUNTOPASILLOCERCAGIMNI");
        mapa.put(puntoPuntoPasilloCercaGimni_136_54_1, puntoPasilloCercaGimni_136_54_1);
        
        puntoPasilloCercaGimni_136_54_1.setEste(puntoCercaAula19_136_48_1);

        Punto puntoPuntoCercaAulaMateriales_136_61_1= new Punto(136,61,1);
        Nodo puntoCercaAulaMateriales_136_61_1= new Nodo(puntoPuntoCercaAulaMateriales_136_61_1, "PUNTOCERCAAULAMATERIALES");
        mapa.put(puntoPuntoCercaAulaMateriales_136_61_1, puntoCercaAulaMateriales_136_61_1);
        
        puntoCercaAulaMateriales_136_61_1.setEste(puntoPasilloCercaGimni_136_54_1);

        Punto puntoAulaMateriales_138_63_1= new Punto(138,63,1);
        Nodo aulaMateriales_138_63_1= new Nodo(puntoAulaMateriales_138_63_1, "AULAMATERIALES");
        mapa.put(puntoAulaMateriales_138_63_1, aulaMateriales_138_63_1);
        
        aulaMateriales_138_63_1.setSureste(puntoCercaAulaMateriales_136_61_1);

        Punto puntoPuntoCercaAulaMateriales_136_65_1= new Punto(136,65,1);
        Nodo puntoCercaAulaMateriales_136_65_1= new Nodo(puntoPuntoCercaAulaMateriales_136_65_1, "PUNTOCERCAAULAMATERIALES");
        mapa.put(puntoPuntoCercaAulaMateriales_136_65_1, puntoCercaAulaMateriales_136_65_1);
        
        puntoCercaAulaMateriales_136_65_1.setNoroeste(aulaMateriales_138_63_1);
        puntoCercaAulaMateriales_136_65_1.setEste(puntoCercaAulaMateriales_136_61_1);

        Punto puntoSanitariosCercaCecovi_131_63_1= new Punto(131,63,1);
        Nodo sanitariosCercaCecovi_131_63_1= new Nodo(puntoSanitariosCercaCecovi_131_63_1, "SANITARIOSCERCACECOVI");
        mapa.put(puntoSanitariosCercaCecovi_131_63_1, sanitariosCercaCecovi_131_63_1);
        
        sanitariosCercaCecovi_131_63_1.setSuroeste(escaleraCecovi_128_64_1);
        sanitariosCercaCecovi_131_63_1.setNorte(aulaMateriales_138_63_1);

        Punto puntoPuntoCercaCecovi_121_66_1= new Punto(121,66,1);
        Nodo puntoCercaCecovi_121_66_1= new Nodo(puntoPuntoCercaCecovi_121_66_1, "PUNTOCERCACECOVI");
        mapa.put(puntoPuntoCercaCecovi_121_66_1, puntoCercaCecovi_121_66_1);
        
        puntoCercaCecovi_121_66_1.setNorte(puntoCercaAulaMateriales_136_65_1);
        puntoCercaCecovi_121_66_1.setNoreste(escaleraCecovi_128_64_1);

        Punto puntoPuntoCercaTutoriaB1_107_36_1= new Punto(107,36,1);
        Nodo puntoCercaTutoriaB1_107_36_1= new Nodo(puntoPuntoCercaTutoriaB1_107_36_1, "PUNTOCERCATUTORIAB1");
        mapa.put(puntoPuntoCercaTutoriaB1_107_36_1, puntoCercaTutoriaB1_107_36_1);
        
        puntoCercaTutoriaB1_107_36_1.setSureste(aula9_104_30_1);
        puntoCercaTutoriaB1_107_36_1.setNoreste(aula10_110_30_1);

        Punto puntoTutoriaB1_106_39_1= new Punto(106,39,1);
        Nodo tutoriaB1_106_39_1= new Nodo(puntoTutoriaB1_106_39_1, "TUTORIAB1");
        mapa.put(puntoTutoriaB1_106_39_1, tutoriaB1_106_39_1);
        
        tutoriaB1_106_39_1.setEste(puntoCercaTutoriaB1_107_36_1);

        Punto puntoSalaInformaticaBasicas_107_40_1= new Punto(107,40,1);
        Nodo salaInformaticaBasicas_107_40_1= new Nodo(puntoSalaInformaticaBasicas_107_40_1, "SALAINFORMATICABASICAS");
        mapa.put(puntoSalaInformaticaBasicas_107_40_1, salaInformaticaBasicas_107_40_1);
        
        salaInformaticaBasicas_107_40_1.setNoreste(tutoriaB1_106_39_1);

        Punto puntoMateriasBasicas_107_41_1= new Punto(107,41,1);
        Nodo materiasBasicas_107_41_1= new Nodo(puntoMateriasBasicas_107_41_1, "MATERIASBASICAS");
        mapa.put(puntoMateriasBasicas_107_41_1, materiasBasicas_107_41_1);
        
        materiasBasicas_107_41_1.setEste(salaInformaticaBasicas_107_40_1);

        Punto puntoTutoriaB2_106_43_1= new Punto(106,43,1);
        Nodo tutoriaB2_106_43_1= new Nodo(puntoTutoriaB2_106_43_1, "TUTORIAB2");
        mapa.put(puntoTutoriaB2_106_43_1, tutoriaB2_106_43_1);
        
        tutoriaB2_106_43_1.setEste(tutoriaB1_106_39_1);
        tutoriaB2_106_43_1.setNoreste(materiasBasicas_107_41_1);

        Punto puntoTutoriaB3_106_45_1= new Punto(106,45,1);
        Nodo tutoriaB3_106_45_1= new Nodo(puntoTutoriaB3_106_45_1, "TUTORIAB3");
        mapa.put(puntoTutoriaB3_106_45_1, tutoriaB3_106_45_1);
        
        tutoriaB3_106_45_1.setEste(tutoriaB2_106_43_1);

        Punto puntoPuntoCercaTotoriaB3_107_48_1= new Punto(107,48,1);
        Nodo puntoCercaTotoriaB3_107_48_1= new Nodo(puntoPuntoCercaTotoriaB3_107_48_1, "PUNTOCERCATOTORIAB3");
        mapa.put(puntoPuntoCercaTotoriaB3_107_48_1, puntoCercaTotoriaB3_107_48_1);
        
        puntoCercaTotoriaB3_107_48_1.setEste(tutoriaB3_106_45_1);

        Punto puntoTutoriaB4_99_48_1= new Punto(99,48,1);
        Nodo tutoriaB4_99_48_1= new Nodo(puntoTutoriaB4_99_48_1, "TUTORIAB4");
        mapa.put(puntoTutoriaB4_99_48_1, tutoriaB4_99_48_1);
        
        tutoriaB4_99_48_1.setNorte(puntoCercaTotoriaB3_107_48_1);

        Punto puntoTutoriaB5_95_48_1= new Punto(95,48,1);
        Nodo tutoriaB5_95_48_1= new Nodo(puntoTutoriaB5_95_48_1, "TUTORIAB5");
        mapa.put(puntoTutoriaB5_95_48_1, tutoriaB5_95_48_1);
        
        tutoriaB5_95_48_1.setNorte(tutoriaB4_99_48_1);

        Punto puntoPasilloSalaEstudioBasicas_107_56_1= new Punto(107,56,1);
        Nodo pasilloSalaEstudioBasicas_107_56_1= new Nodo(puntoPasilloSalaEstudioBasicas_107_56_1, "PASILLOSALAESTUDIOBASICAS");
        mapa.put(puntoPasilloSalaEstudioBasicas_107_56_1, pasilloSalaEstudioBasicas_107_56_1);
        
        pasilloSalaEstudioBasicas_107_56_1.setEste(puntoCercaTotoriaB3_107_48_1);

        Punto puntoPasilloSalaEstudioBasicas_107_60_1= new Punto(107,60,1);
        Nodo pasilloSalaEstudioBasicas_107_60_1= new Nodo(puntoPasilloSalaEstudioBasicas_107_60_1, "PASILLOSALAESTUDIOBASICAS");
        mapa.put(puntoPasilloSalaEstudioBasicas_107_60_1, pasilloSalaEstudioBasicas_107_60_1);
        
        pasilloSalaEstudioBasicas_107_60_1.setEste(pasilloSalaEstudioBasicas_107_56_1);

        Punto puntoPuntoCercaAula20_112_61_1= new Punto(112,61,1);
        Nodo puntoCercaAula20_112_61_1= new Nodo(puntoPuntoCercaAula20_112_61_1, "PUNTOCERCAAULA20");
        mapa.put(puntoPuntoCercaAula20_112_61_1, puntoCercaAula20_112_61_1);
        
        puntoCercaAula20_112_61_1.setSur(pasilloSalaEstudioBasicas_107_60_1);
        puntoCercaAula20_112_61_1.setNoreste(escaleraCercaAula20_113_60_1);

        Punto puntoPuntoFrenteAula20_117_61_1= new Punto(117,61,1);
        Nodo puntoFrenteAula20_117_61_1= new Nodo(puntoPuntoFrenteAula20_117_61_1, "PUNTOFRENTEAULA20");
        mapa.put(puntoPuntoFrenteAula20_117_61_1, puntoFrenteAula20_117_61_1);
        
        puntoFrenteAula20_117_61_1.setSur(puntoCercaAula20_112_61_1);

        Punto puntoAulaFagdut_118_59_1= new Punto(118,59,1);
        Nodo aulaFagdut_118_59_1= new Nodo(puntoAulaFagdut_118_59_1, "AULAFAGDUT");
        mapa.put(puntoAulaFagdut_118_59_1, aulaFagdut_118_59_1);
        
        aulaFagdut_118_59_1.setSuroeste(puntoFrenteAula20_117_61_1);

        Punto puntoAula20_119_61_1= new Punto(119,61,1);
        Nodo aula20_119_61_1= new Nodo(puntoAula20_119_61_1, "AULA20");
        mapa.put(puntoAula20_119_61_1, aula20_119_61_1);
        
        aula20_119_61_1.setSur(puntoFrenteAula20_117_61_1);

        escaleraCecovi_122_64_1.setEscalera(escaleraCercaJavalab_128_64_2);
        escaleraCecovi_122_64_1.setOeste(puntoCercaCecovi_121_66_1);

        Punto puntoPuntoCercaDeptoCivil_112_66_1= new Punto(112,66,1);
        Nodo puntoCercaDeptoCivil_112_66_1= new Nodo(puntoPuntoCercaDeptoCivil_112_66_1, "PUNTOCERCADEPTOCIVIL");
        mapa.put(puntoPuntoCercaDeptoCivil_112_66_1, puntoCercaDeptoCivil_112_66_1);
        
        puntoCercaDeptoCivil_112_66_1.setNorte(puntoCercaCecovi_121_66_1);
        puntoCercaDeptoCivil_112_66_1.setEste(puntoCercaAula20_112_61_1);
        puntoCercaDeptoCivil_112_66_1.setNoreste(escaleraCecovi_122_64_1);

        Punto puntoDeptoCivil_111_71_1= new Punto(111,71,1);
        Nodo deptoCivil_111_71_1= new Nodo(puntoDeptoCivil_111_71_1, "DEPTOCIVIL");
        mapa.put(puntoDeptoCivil_111_71_1, deptoCivil_111_71_1);
        
        deptoCivil_111_71_1.setEste(puntoCercaDeptoCivil_112_66_1);

        Punto puntoPasilloDeptoCivil_112_78_1= new Punto(112,78,1);
        Nodo pasilloDeptoCivil_112_78_1= new Nodo(puntoPasilloDeptoCivil_112_78_1, "PASILLODEPTOCIVIL");
        mapa.put(puntoPasilloDeptoCivil_112_78_1, pasilloDeptoCivil_112_78_1);
        
        pasilloDeptoCivil_112_78_1.setEste(deptoCivil_111_71_1);

        escaleraDeptoIndustrial_117_89_1.setEscalera(escaleraEntradaPosteriorAula21_114_89_2);
                
        Punto puntoPuntoEntreDeptoCivilEIndustrial_112_84_1= new Punto(112,84,1);
        Nodo puntoEntreDeptoCivilEIndustrial_112_84_1= new Nodo(puntoPuntoEntreDeptoCivilEIndustrial_112_84_1, "PUNTOENTREDEPTOCIVILEINDUSTRIAL");
        mapa.put(puntoPuntoEntreDeptoCivilEIndustrial_112_84_1, puntoEntreDeptoCivilEIndustrial_112_84_1);
        
        puntoEntreDeptoCivilEIndustrial_112_84_1.setNorte(ascensor1Piso_114_84_1);
        puntoEntreDeptoCivilEIndustrial_112_84_1.setEste(pasilloDeptoCivil_112_78_1);

        Punto puntoDeptoIndustrial_119_87_1= new Punto(119,87,1);
        Nodo deptoIndustrial_119_87_1= new Nodo(puntoDeptoIndustrial_119_87_1, "DEPTOINDUSTRIAL");
        mapa.put(puntoDeptoIndustrial_119_87_1, deptoIndustrial_119_87_1);
        
        deptoIndustrial_119_87_1.setSureste(ascensor1Piso_114_84_1);

        Punto puntoPuntoEntreEscalerasDeptoIndustrial_116_89_1= new Punto(116,89,1);
        Nodo puntoEntreEscalerasDeptoIndustrial_116_89_1= new Nodo(puntoPuntoEntreEscalerasDeptoIndustrial_116_89_1, "PUNTOENTREESCALERASDEPTOINDUSTRIAL");
        mapa.put(puntoPuntoEntreEscalerasDeptoIndustrial_116_89_1, puntoEntreEscalerasDeptoIndustrial_116_89_1);
       
        
        puntoEntreEscalerasDeptoIndustrial_116_89_1.setSur(escaleraDeptoIndustrial_114_89_1);
        puntoEntreEscalerasDeptoIndustrial_116_89_1.setNorte(escaleraDeptoIndustrial_117_89_1);
        puntoEntreEscalerasDeptoIndustrial_116_89_1.setNoreste(deptoIndustrial_119_87_1);
        puntoEntreEscalerasDeptoIndustrial_116_89_1.setSureste(ascensor1Piso_114_84_1);

        Punto puntoPuntoPasilloSalaEstudioPosgrado_103_86_1= new Punto(103,86,1);
        Nodo puntoPasilloSalaEstudioPosgrado_103_86_1= new Nodo(puntoPuntoPasilloSalaEstudioPosgrado_103_86_1, "PUNTOPASILLOSALAESTUDIOPOSGRADO");
        mapa.put(puntoPuntoPasilloSalaEstudioPosgrado_103_86_1, puntoPasilloSalaEstudioPosgrado_103_86_1);
        
        puntoPasilloSalaEstudioPosgrado_103_86_1.setNorte(deptoIndustrial_119_87_1);
        puntoPasilloSalaEstudioPosgrado_103_86_1.setNoreste(puntoEntreDeptoCivilEIndustrial_112_84_1);
        puntoPasilloSalaEstudioPosgrado_103_86_1.setNoroeste(escaleraDeptoIndustrial_114_89_1);

        Punto puntoPuntoPasilloSalaEstudioPosgrado_91_86_1= new Punto(91,86,1);
        Nodo puntoPasilloSalaEstudioPosgrado_91_86_1= new Nodo(puntoPuntoPasilloSalaEstudioPosgrado_91_86_1, "PUNTOPASILLOSALAESTUDIOPOSGRADO");
        mapa.put(puntoPuntoPasilloSalaEstudioPosgrado_91_86_1, puntoPasilloSalaEstudioPosgrado_91_86_1);
        
        puntoPasilloSalaEstudioPosgrado_91_86_1.setNorte(puntoPasilloSalaEstudioPosgrado_103_86_1);

        Punto puntoPuntoPasilloPosgrado_84_86_1= new Punto(84,86,1);
        Nodo puntoPasilloPosgrado_84_86_1= new Nodo(puntoPuntoPasilloPosgrado_84_86_1, "PUNTOPASILLOPOSGRADO");
        mapa.put(puntoPuntoPasilloPosgrado_84_86_1, puntoPasilloPosgrado_84_86_1);
        
        puntoPasilloPosgrado_84_86_1.setNorte(puntoPasilloSalaEstudioPosgrado_91_86_1);

        Punto puntoPuntoAAulasEXX_83_74_1= new Punto(83,74,1);
        Nodo puntoAAulasEXX_83_74_1= new Nodo(puntoPuntoAAulasEXX_83_74_1, "PUNTOAAULASEXX");
        mapa.put(puntoPuntoAAulasEXX_83_74_1, puntoAAulasEXX_83_74_1);
        
        puntoAAulasEXX_83_74_1.setOeste(puntoPasilloPosgrado_84_86_1);

        Punto puntoAulaE3_82_72_1= new Punto(82,72,1);
        Nodo aulaE3_82_72_1= new Nodo(puntoAulaE3_82_72_1, "AULAE3");
        mapa.put(puntoAulaE3_82_72_1, aulaE3_82_72_1);
        
        aulaE3_82_72_1.setNoroeste(puntoAAulasEXX_83_74_1);

        Punto puntoAulaE2_82_62_1= new Punto(82,62,1);
        Nodo aulaE2_82_62_1= new Nodo(puntoAulaE2_82_62_1, "AULAE2");
        mapa.put(puntoAulaE2_82_62_1, aulaE2_82_62_1);
        
        aulaE2_82_62_1.setOeste(aulaE3_82_72_1);

        Punto puntoAulaE1_82_55_1= new Punto(82,55,1);
        Nodo aulaE1_82_55_1= new Nodo(puntoAulaE1_82_55_1, "AULAE1");
        mapa.put(puntoAulaE1_82_55_1, aulaE1_82_55_1);
        
        aulaE1_82_55_1.setOeste(aulaE2_82_62_1);

        Punto puntoAulaVideoconferencia_82_51_1= new Punto(82,51,1);
        Nodo aulaVideoconferencia_82_51_1= new Nodo(puntoAulaVideoconferencia_82_51_1, "AULAVIDEOCONFERENCIA");
        mapa.put(puntoAulaVideoconferencia_82_51_1, aulaVideoconferencia_82_51_1);
        
        aulaVideoconferencia_82_51_1.setOeste(aulaE1_82_55_1);

        Punto puntoPuntoPasilloPosgrado_70_86_1= new Punto(70,86,1);
        Nodo puntoPasilloPosgrado_70_86_1= new Nodo(puntoPuntoPasilloPosgrado_70_86_1, "PUNTOPASILLOPOSGRADO");
        mapa.put(puntoPuntoPasilloPosgrado_70_86_1, puntoPasilloPosgrado_70_86_1);
        
        Punto puntoSecAcademica_72_91_1= new Punto(72,91,1);
        Nodo secAcademica_72_91_1= new Nodo(puntoSecAcademica_72_91_1, "SECACADEMICA");
        mapa.put(puntoSecAcademica_72_91_1, secAcademica_72_91_1);
        
        secAcademica_72_91_1.setSur(escalera1PisoTorreAdm_67_91_1);

        Punto puntoPuntoCercaSecAcademica_69_89_1= new Punto(69,89,1);
        Nodo puntoCercaSecAcademica_69_89_1= new Nodo(puntoPuntoCercaSecAcademica_69_89_1, "PUNTOCERCASECACADEMICA");
        mapa.put(puntoPuntoCercaSecAcademica_69_89_1, puntoCercaSecAcademica_69_89_1);
        
        puntoCercaSecAcademica_69_89_1.setNoroeste(secAcademica_72_91_1);
        puntoCercaSecAcademica_69_89_1.setSuroeste(escalera1PisoTorreAdm_67_91_1);

        Punto puntoPuntoPasilloPosgrado_65_86_1= new Punto(65,86,1);
        Nodo puntoPasilloPosgrado_65_86_1= new Nodo(puntoPuntoPasilloPosgrado_65_86_1, "PUNTOPASILLOPOSGRADO");
        mapa.put(puntoPuntoPasilloPosgrado_65_86_1, puntoPasilloPosgrado_65_86_1);
        
        puntoPasilloPosgrado_65_86_1.setNorte(puntoPasilloPosgrado_70_86_1);
        puntoPasilloPosgrado_65_86_1.setNoroeste(puntoCercaSecAcademica_69_89_1);

        Punto puntoPosgrado_60_88_1= new Punto(60,88,1);
        Nodo posgrado_60_88_1= new Nodo(puntoPosgrado_60_88_1, "POSGRADO");
        mapa.put(puntoPosgrado_60_88_1, posgrado_60_88_1);
        
        posgrado_60_88_1.setNoreste(puntoPasilloPosgrado_65_86_1);


        Punto puntoAulaMM5_64_83_1= new Punto(64,83,1);
        Nodo aulaMM5_64_83_1= new Nodo(puntoAulaMM5_64_83_1, "AULAMM5");
        mapa.put(puntoAulaMM5_64_83_1, aulaMM5_64_83_1);
        
        aulaMM5_64_83_1.setNoroeste(puntoPasilloPosgrado_65_86_1);

        Punto puntoPuntoPasilloMM_51_86_1= new Punto(51,86,1);
        Nodo puntoPasilloMM_51_86_1= new Nodo(puntoPuntoPasilloMM_51_86_1, "PUNTOPASILLOMM");
        mapa.put(puntoPuntoPasilloMM_51_86_1, puntoPasilloMM_51_86_1);
        
        puntoPasilloMM_51_86_1.setNorte(puntoPasilloPosgrado_65_86_1);
        puntoPasilloMM_51_86_1.setNoreste(aulaMM5_64_83_1);

        Punto puntoAulaMM1_52_88_1= new Punto(52,88,1);
        Nodo aulaMM1_52_88_1= new Nodo(puntoAulaMM1_52_88_1, "AULAMM1");
        mapa.put(puntoAulaMM1_52_88_1, aulaMM1_52_88_1);
        
        aulaMM1_52_88_1.setSureste(puntoPasilloMM_51_86_1);
        aulaMM1_52_88_1.setNorte(posgrado_60_88_1);

        Punto puntoAulaCisco_50_84_1= new Punto(50,84,1);
        Nodo aulaCisco_50_84_1= new Nodo(puntoAulaCisco_50_84_1, "AULACISCO");
        mapa.put(puntoAulaCisco_50_84_1, aulaCisco_50_84_1);
        
        aulaCisco_50_84_1.setNoroeste(puntoPasilloMM_51_86_1);

        Punto puntoAulaMM2_49_88_1= new Punto(49,88,1);
        Nodo aulaMM2_49_88_1= new Nodo(puntoAulaMM2_49_88_1, "AULAMM2");
        mapa.put(puntoAulaMM2_49_88_1, aulaMM2_49_88_1);
        
        aulaMM2_49_88_1.setNoreste(puntoPasilloMM_51_86_1);
        aulaMM2_49_88_1.setNorte(aulaMM1_52_88_1);

        Punto puntoAulaMM3_42_88_1= new Punto(42,88,1);
        Nodo aulaMM3_42_88_1= new Nodo(puntoAulaMM3_42_88_1, "AULAMM3");
        mapa.put(puntoAulaMM3_42_88_1, aulaMM3_42_88_1);
        
        aulaMM3_42_88_1.setNorte(aulaMM2_49_88_1);

        Punto puntoAulaCiscoBB_38_84_1= new Punto(38,84,1);
        Nodo aulaCiscoBB_38_84_1= new Nodo(puntoAulaCiscoBB_38_84_1, "AULACISCOBB");
        mapa.put(puntoAulaCiscoBB_38_84_1, aulaCiscoBB_38_84_1);
        
        aulaCiscoBB_38_84_1.setNorte(aulaCisco_50_84_1);

        Punto puntoPuntoPasilloMM_37_86_1= new Punto(37,86,1);
        Nodo puntoPasilloMM_37_86_1= new Nodo(puntoPuntoPasilloMM_37_86_1, "PUNTOPASILLOMM");
        mapa.put(puntoPuntoPasilloMM_37_86_1, puntoPasilloMM_37_86_1);
        
        puntoPasilloMM_37_86_1.setNoreste(aulaCiscoBB_38_84_1);
        puntoPasilloMM_37_86_1.setNoroeste(aulaMM3_42_88_1);
        puntoPasilloMM_37_86_1.setNorte(puntoPasilloMM_51_86_1);

        Punto puntoAulaMM4_36_84_1= new Punto(36,84,1);
        Nodo aulaMM4_36_84_1= new Nodo(puntoAulaMM4_36_84_1, "AULAMM4");
        mapa.put(puntoAulaMM4_36_84_1, aulaMM4_36_84_1);
        
        aulaMM4_36_84_1.setNoroeste(puntoPasilloMM_37_86_1);

        Punto puntoPuntoPasilloMM_31_86_1= new Punto(31,86,1);
        Nodo puntoPasilloMM_31_86_1= new Nodo(puntoPuntoPasilloMM_31_86_1, "PUNTOPASILLOMM");
        mapa.put(puntoPuntoPasilloMM_31_86_1, puntoPasilloMM_31_86_1);
        
        puntoPasilloMM_31_86_1.setNorte(puntoPasilloMM_37_86_1);
        puntoPasilloMM_31_86_1.setNoreste(aulaMM4_36_84_1);

        Punto puntoHallPlateasAltas_26_83_1= new Punto(26,83,1);
        Nodo hallPlateasAltas_26_83_1= new Nodo(puntoHallPlateasAltas_26_83_1, "HALLPLATEASALTAS");
        mapa.put(puntoHallPlateasAltas_26_83_1, hallPlateasAltas_26_83_1);
        
        hallPlateasAltas_26_83_1.setNorte(puntoPasilloMM_31_86_1);

        Punto puntoPasilloAHallPlateasAltas_28_89_1= new Punto(28,89,1);
        Nodo pasilloAHallPlateasAltas_28_89_1= new Nodo(puntoPasilloAHallPlateasAltas_28_89_1, "PASILLOAHALLPLATEASALTAS");
        mapa.put(puntoPasilloAHallPlateasAltas_28_89_1, pasilloAHallPlateasAltas_28_89_1);
        
        pasilloAHallPlateasAltas_28_89_1.setSureste(hallPlateasAltas_26_83_1);
        pasilloAHallPlateasAltas_28_89_1.setNoreste(puntoPasilloMM_31_86_1);

        Punto puntoSanitariosHallPlateasAltas_28_93_1= new Punto(28,93,1);
        Nodo sanitariosHallPlateasAltas_28_93_1= new Nodo(puntoSanitariosHallPlateasAltas_28_93_1, "SANITARIOSHALLPLATEASALTAS");
        mapa.put(puntoSanitariosHallPlateasAltas_28_93_1, sanitariosHallPlateasAltas_28_93_1);
        
        sanitariosHallPlateasAltas_28_93_1.setEste(pasilloAHallPlateasAltas_28_89_1);
        sanitariosHallPlateasAltas_28_93_1.setSur(escaleraSanitariosHallPlateaAlta_27_93_1);


        escaleraEntradaPosteriorAula21_114_89_2.setEste(ascensor2Piso_114_84_2);
        escaleraEntradaPosteriorAula21_117_89_2.setEscalera(escaleraCercaAscensor_115_89_3);

        Punto puntoPuntoEntreEscalerasPiso2_115_88_2= new Punto(115,88,2);
        Nodo puntoEntreEscalerasPiso2_115_88_2= new Nodo(puntoPuntoEntreEscalerasPiso2_115_88_2, "PUNTOENTREESCALERASPISO2");
        mapa.put(puntoPuntoEntreEscalerasPiso2_115_88_2, puntoEntreEscalerasPiso2_115_88_2);
        
        puntoEntreEscalerasPiso2_115_88_2.setSuroeste(escaleraEntradaPosteriorAula21_114_89_2);
        puntoEntreEscalerasPiso2_115_88_2.setNoroeste(escaleraEntradaPosteriorAula21_117_89_2);
        puntoEntreEscalerasPiso2_115_88_2.setSureste(ascensor2Piso_114_84_2);

        Punto puntoJavalab_128_63_2= new Punto(128,63,2);
        Nodo javalab_128_63_2= new Nodo(puntoJavalab_128_63_2, "JAVALAB");
        mapa.put(puntoJavalab_128_63_2, javalab_128_63_2);
        

        escaleraCercaJavalab_128_64_2.setEste(javalab_128_63_2);

        Punto puntoPasilloFrenteJavaLab_131_64_2= new Punto(131,64,2);
        Nodo pasilloFrenteJavaLab_131_64_2= new Nodo(puntoPasilloFrenteJavaLab_131_64_2, "PASILLOFRENTEJAVALAB");
        mapa.put(puntoPasilloFrenteJavaLab_131_64_2, pasilloFrenteJavaLab_131_64_2);
        
        Punto puntoPasilloAula21_132_70_2= new Punto(132,70,2);
        Nodo pasilloAula21_132_70_2= new Nodo(puntoPasilloAula21_132_70_2, "PASILLOAULA21");
        mapa.put(puntoPasilloAula21_132_70_2, pasilloAula21_132_70_2);
        
        Punto puntoAula21_132_75_2= new Punto(132,75,2);
        Nodo aula21_132_75_2= new Nodo(puntoAula21_132_75_2, "AULA21");
        mapa.put(puntoAula21_132_75_2, aula21_132_75_2);
        
        pasilloAula21_132_70_2.setOeste(aula21_132_75_2);

        pasilloFrenteJavaLab_131_64_2.setOeste(pasilloAula21_132_70_2);
        pasilloFrenteJavaLab_131_64_2.setSur(escaleraCercaJavalab_128_64_2);
        pasilloFrenteJavaLab_131_64_2.setSureste(javalab_128_63_2);

        Punto puntoAnexoISI_137_67_2= new Punto(137,67,2);
        Nodo anexoISI_137_67_2= new Nodo(puntoAnexoISI_137_67_2, "ANEXOISI");
        mapa.put(puntoAnexoISI_137_67_2, anexoISI_137_67_2);
        
        Punto puntoPuntoCercaAula22_136_64_2= new Punto(136,64,2);
        Nodo puntoCercaAula22_136_64_2= new Nodo(puntoPuntoCercaAula22_136_64_2, "PUNTOCERCAAULA22");
        mapa.put(puntoPuntoCercaAula22_136_64_2, puntoCercaAula22_136_64_2);
        
        puntoCercaAula22_136_64_2.setSur(pasilloFrenteJavaLab_131_64_2);

        Punto puntoAula22_138_63_2= new Punto(138,63,2);
        Nodo aula22_138_63_2= new Nodo(puntoAula22_138_63_2, "AULA22");
        mapa.put(puntoAula22_138_63_2, aula22_138_63_2);
        
        aula22_138_63_2.setOeste(anexoISI_137_67_2);
        aula22_138_63_2.setSur(puntoCercaAula22_136_64_2);

        Punto puntoEscaleraCercaAnexo_136_66_2= new Punto(136,66,2);
        NodoEscalera escaleraCercaAnexo_136_66_2= new NodoEscalera(puntoEscaleraCercaAnexo_136_66_2, "ESCALERACERCAANEXO");
        mapa.put(puntoEscaleraCercaAnexo_136_66_2, escaleraCercaAnexo_136_66_2);
        
        escaleraCercaAnexo_136_66_2.setNoroeste(anexoISI_137_67_2);
        escaleraCercaAnexo_136_66_2.setNoreste(aula22_138_63_2);
        escaleraCercaAnexo_136_66_2.setSur(puntoCercaAula22_136_64_2);

        Punto puntoEscaleraCercaAnexo_133_66_3= new Punto(133,66,3);
        NodoEscalera escaleraCercaAnexo_133_66_3= new NodoEscalera(puntoEscaleraCercaAnexo_133_66_3, "ESCALERACERCAANEXO");
        mapa.put(puntoEscaleraCercaAnexo_133_66_3, escaleraCercaAnexo_133_66_3);
        
        escaleraCercaAnexo_133_66_3.setEscalera(escaleraCercaAnexo_136_66_2);

        Punto puntoPuntoCercaEscaleraAnexo_131_66_3= new Punto(131,66,3);
        Nodo puntoCercaEscaleraAnexo_131_66_3= new Nodo(puntoPuntoCercaEscaleraAnexo_131_66_3, "PUNTOCERCAESCALERAANEXO");
        mapa.put(puntoPuntoCercaEscaleraAnexo_131_66_3, puntoCercaEscaleraAnexo_131_66_3);
        
        puntoCercaEscaleraAnexo_131_66_3.setNorte(escaleraCercaAnexo_133_66_3);

        Punto puntoPuntoPasilloDeptoISI_131_61_3= new Punto(131,61,3);
        Nodo puntoPasilloDeptoISI_131_61_3= new Nodo(puntoPuntoPasilloDeptoISI_131_61_3, "PUNTOPASILLODEPTOISI");
        mapa.put(puntoPuntoPasilloDeptoISI_131_61_3, puntoPasilloDeptoISI_131_61_3);
        
        puntoPasilloDeptoISI_131_61_3.setOeste(puntoCercaEscaleraAnexo_131_66_3);

        Punto puntoPuntoPasilloDeptoISI_139_61_3= new Punto(139,61,3);
        Nodo puntoPasilloDeptoISI_139_61_3= new Nodo(puntoPuntoPasilloDeptoISI_139_61_3, "PUNTOPASILLODEPTOISI");
        mapa.put(puntoPuntoPasilloDeptoISI_139_61_3, puntoPasilloDeptoISI_139_61_3);
        
        puntoPasilloDeptoISI_139_61_3.setSur(puntoPasilloDeptoISI_131_61_3);

        Punto puntoLab1_134_59_3= new Punto(134,59,3);
        Nodo lab1_134_59_3= new Nodo(puntoLab1_134_59_3, "LAB1");
        mapa.put(puntoLab1_134_59_3, lab1_134_59_3);
        
        lab1_134_59_3.setNoroeste(puntoPasilloDeptoISI_139_61_3);
        lab1_134_59_3.setSuroeste(puntoPasilloDeptoISI_131_61_3);

        Punto puntoPuntoPasilloDeptoISI_150_61_3= new Punto(150,61,3);
        Nodo puntoPasilloDeptoISI_150_61_3= new Nodo(puntoPuntoPasilloDeptoISI_150_61_3, "PUNTOPASILLODEPTOISI");
        mapa.put(puntoPuntoPasilloDeptoISI_150_61_3, puntoPasilloDeptoISI_150_61_3);
        
        puntoPasilloDeptoISI_150_61_3.setSur(puntoPasilloDeptoISI_139_61_3);

        Punto puntoLabConectividad_144_59_3= new Punto(144,59,3);
        Nodo labConectividad_144_59_3= new Nodo(puntoLabConectividad_144_59_3, "LABCONECTIVIDAD");
        mapa.put(puntoLabConectividad_144_59_3, labConectividad_144_59_3);
        
        labConectividad_144_59_3.setNoroeste(puntoPasilloDeptoISI_150_61_3);
        labConectividad_144_59_3.setSuroeste(puntoPasilloDeptoISI_139_61_3);

        Punto puntoPuntoEntreLab4y5_153_60_3= new Punto(153,60,3);
        Nodo puntoEntreLab4y5_153_60_3= new Nodo(puntoPuntoEntreLab4y5_153_60_3, "PUNTOENTRELAB4Y5");
        mapa.put(puntoPuntoEntreLab4y5_153_60_3, puntoEntreLab4y5_153_60_3);
        
        Punto puntoLab5_154_61_3= new Punto(154,61,3);
        Nodo lab5_154_61_3= new Nodo(puntoLab5_154_61_3, "LAB5");
        mapa.put(puntoLab5_154_61_3, lab5_154_61_3);
        
        Punto puntoLab4_154_56_3= new Punto(154,56,3);
        Nodo lab4_154_56_3= new Nodo(puntoLab4_154_56_3, "LAB4");
        mapa.put(puntoLab4_154_56_3, lab4_154_56_3);
        
        puntoEntreLab4y5_153_60_3.setNoroeste(lab5_154_61_3);
        puntoEntreLab4y5_153_60_3.setNoreste(lab4_154_56_3);
        puntoEntreLab4y5_153_60_3.setSur(puntoPasilloDeptoISI_150_61_3);

        lab4_154_56_3.setSuroeste(puntoPasilloDeptoISI_131_61_3);
        lab4_154_56_3.setNoroeste(puntoPasilloDeptoISI_139_61_3);

        Punto puntoCidisi_124_60_3= new Punto(124,60,3);
        Nodo cidisi_124_60_3= new Nodo(puntoCidisi_124_60_3, "CIDISI");
//        destino=cidisi_124_60_3.clone();
        mapa.put(puntoCidisi_124_60_3, cidisi_124_60_3);
        
        cidisi_124_60_3.setNoroeste(puntoPasilloDeptoISI_131_61_3);

        Punto puntoDireccionDeptoISI_120_61_3= new Punto(120,61,3);
        Nodo direccionDeptoISI_120_61_3= new Nodo(puntoDireccionDeptoISI_120_61_3, "DIRECCIONDEPTOISI");
        mapa.put(puntoDireccionDeptoISI_120_61_3, direccionDeptoISI_120_61_3);
        
        Punto puntoPuntoPasilloCercaCidisi_122_61_3= new Punto(122,61,3);
        Nodo puntoPasilloCercaCidisi_122_61_3= new Nodo(puntoPuntoPasilloCercaCidisi_122_61_3, "PUNTOPASILLOCERCACIDISI");
        mapa.put(puntoPuntoPasilloCercaCidisi_122_61_3, puntoPasilloCercaCidisi_122_61_3);
        
        puntoPasilloCercaCidisi_122_61_3.setSur(direccionDeptoISI_120_61_3);
        puntoPasilloCercaCidisi_122_61_3.setNoreste(cidisi_124_60_3);
        puntoPasilloCercaCidisi_122_61_3.setNorte(puntoPasilloDeptoISI_131_61_3);

        Punto puntoPuntoPasilloCercaSoporte_122_66_3= new Punto(122,66,3);
        Nodo puntoPasilloCercaSoporte_122_66_3= new Nodo(puntoPuntoPasilloCercaSoporte_122_66_3, "PUNTOPASILLOCERCASOPORTE");
        mapa.put(puntoPuntoPasilloCercaSoporte_122_66_3, puntoPasilloCercaSoporte_122_66_3);
        
        puntoPasilloCercaSoporte_122_66_3.setEste(puntoPasilloCercaCidisi_122_61_3);

        Punto puntoSoporte_123_68_3= new Punto(123,68,3);
        Nodo soporte_123_68_3= new Nodo(puntoSoporte_123_68_3, "SOPORTE");
        mapa.put(puntoSoporte_123_68_3, soporte_123_68_3);
        
        soporte_123_68_3.setSureste(puntoPasilloCercaSoporte_122_66_3);

        Punto puntoPuntoPasilloCercaOficinaRomaniz_122_73_3= new Punto(122,73,3);
        Nodo puntoPasilloCercaOficinaRomaniz_122_73_3= new Nodo(puntoPuntoPasilloCercaOficinaRomaniz_122_73_3, "PUNTOPASILLOCERCAOFICINAROMANIZ");
        mapa.put(puntoPuntoPasilloCercaOficinaRomaniz_122_73_3, puntoPasilloCercaOficinaRomaniz_122_73_3);
        
        puntoPasilloCercaOficinaRomaniz_122_73_3.setEste(puntoPasilloCercaSoporte_122_66_3);
        puntoPasilloCercaOficinaRomaniz_122_73_3.setNoreste(soporte_123_68_3);

        Punto puntoPuntoPasilloCercaAulaEstudioOeste_122_80_3= new Punto(122,80,3);
        Nodo puntoPasilloCercaAulaEstudioOeste_122_80_3= new Nodo(puntoPuntoPasilloCercaAulaEstudioOeste_122_80_3, "PUNTOPASILLOCERCAAULAESTUDIOOESTE");
        mapa.put(puntoPuntoPasilloCercaAulaEstudioOeste_122_80_3, puntoPasilloCercaAulaEstudioOeste_122_80_3);
        
        puntoPasilloCercaAulaEstudioOeste_122_80_3.setEste(puntoPasilloCercaOficinaRomaniz_122_73_3);

        Punto puntoPuntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3= new Punto(122,84,3);
        Nodo puntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3= new Nodo(puntoPuntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3, "PUNTOPASILLOCERCAMESAESTUDIOYAULAESTUDIOOESTE");
        mapa.put(puntoPuntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3, puntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3);
        
        puntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3.setEste(puntoPasilloCercaAulaEstudioOeste_122_80_3);

        Punto puntoPuntoCercaEscaleraTercerPiso_115_64_3= new Punto(115,64,3);
        Nodo puntoCercaEscaleraTercerPiso_115_64_3= new Nodo(puntoPuntoCercaEscaleraTercerPiso_115_64_3, "PUNTOENTREASCENSORYESCALERA");
        mapa.put(puntoPuntoCercaEscaleraTercerPiso_115_64_3, puntoCercaEscaleraTercerPiso_115_64_3);
        
        puntoCercaEscaleraTercerPiso_115_64_3.setEste(ascensor3Piso_114_84_3);
        puntoCercaEscaleraTercerPiso_115_64_3.setOeste(escaleraCercaAscensor_115_89_3);
        puntoCercaEscaleraTercerPiso_115_64_3.setSur(puntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3);

        ascensor3Piso_114_84_3.setAscensor0(ascensorPB_115_84_0);
        ascensor3Piso_114_84_3.setAscensor1(ascensor1Piso_114_84_1);
        ascensor3Piso_114_84_3.setAscensor2(ascensor2Piso_114_84_2);

        ascensor2Piso_114_84_2.setAscensor0(ascensorPB_115_84_0);
        ascensor2Piso_114_84_2.setAscensor1(ascensor1Piso_114_84_1);
        ascensor2Piso_114_84_2.setAscensor3(ascensor3Piso_114_84_3);

        ascensor1Piso_114_84_1.setAscensor0(ascensorPB_115_84_0);
        ascensor1Piso_114_84_1.setAscensor2(ascensor2Piso_114_84_2);
        ascensor1Piso_114_84_1.setAscensor3(ascensor3Piso_114_84_3);

        ascensorPB_115_84_0.setAscensor1(ascensor1Piso_114_84_1);
        ascensorPB_115_84_0.setAscensor2(ascensor2Piso_114_84_2);
        ascensorPB_115_84_0.setAscensor3(ascensor3Piso_114_84_3);
        
        //posicion=hall_108_39_0.clone();
        //obstaculos.add(escaleraCecovi_122_64_1);
        //nodosSinLuz.add(giedi_114_43_0);
    }

	public static Map<Punto, Nodo> cargarDatos() {
		
		if(mapa.isEmpty())
			levantarDatos();
		
/*		Map<Punto, Nodo> map = new HashMap<Punto, Nodo>();
		
		for (Entry<Punto, Nodo> entry : mapa.entrySet())
		{
		    map.put(entry.getKey(), entry.getValue().clone());
		}
*/		return mapa;
	}

	public static Nodo getPosicion() {
		// TODO Auto-generated method stub
		return posicion;
	}

	public static Nodo getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}

	public static List<Nodo> getObstaculos() {
		return obstaculos;
	}

	public static List<Nodo> getNodosSinLuz() {
		// TODO Auto-generated method stub
		return nodosSinLuz;
	}
	public static void addObstaculo(Nodo nodo){
            obstaculos.add(nodo);
        }                
        public static void removeObstaculo(Nodo nodo){
            Nodo nodoEliminar=null;
            for(Nodo nodoIterador : obstaculos){
                if(nodoIterador.equals(nodo)){
                    nodoEliminar=nodoIterador;
                }
            }
            obstaculos.remove(nodoEliminar);
            
        }
        public static void addNodoSinLuz(Nodo nodo){
            nodosSinLuz.add(nodo);
        }                
        public static void removeNodoSinLuz(Nodo nodo){
            Nodo nodoEliminar=null;
            for(Nodo nodoIterador : nodosSinLuz){
                if(nodoIterador.equals(nodo)){
                    nodoEliminar=nodoIterador;
                }
            }
            nodosSinLuz.remove(nodoEliminar);
            
        }

    public static void setAscensoresFueraServicio(boolean ascensoresFueraServicio) {
        DatosMapa.ascensoresFueraServicio = ascensoresFueraServicio;
    }

    public static void setEnergiaElectrica(boolean energiaElectrica) {
        DatosMapa.energiaElectrica = energiaElectrica;
    }

    public static boolean isAscensoresFueraServicio() {
        return ascensoresFueraServicio;
    }

    public static boolean isEnergiaElectrica() {
        return energiaElectrica;
    }
        
}

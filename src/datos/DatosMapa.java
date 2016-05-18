package datos;

import domain.Nodo;
import domain.NodoAscensor;
import domain.NodoEscalera;
import domain.Punto;

public class DatosMapa {
	
	public void datos(){
		Punto puntoAscensor1Piso_114_84_1= new Punto(114,84,1);
                NodoAscensor ascensor1Piso_114_84_1= new NodoAscensor(puntoAscensor1Piso_114_84_1, "ASCENSOR1PISO");

                Punto puntoAscensor2Piso_114_84_2= new Punto(114,84,2);
                NodoAscensor ascensor2Piso_114_84_2= new NodoAscensor(puntoAscensor2Piso_114_84_2, "ASCENSOR2PISO");
                
                Punto puntoAscensor3Piso_114_84_3= new Punto(114,84,3);
                NodoAscensor ascensor3Piso_114_84_3= new NodoAscensor(puntoAscensor3Piso_114_84_3, "ASCENSOR3PISO");
                
                
                Punto puntoPuntoEntreEscalerasPiso2_115_88_2= new Punto(115,88,2);
                Nodo puntoEntreEscalerasPiso2_115_88_2= new Nodo(puntoPuntoEntreEscalerasPiso2_115_88_2, "PUNTOENTREESCALERASPISO2");
                
                Punto puntoPuntoEntreEscalerasPiso1CercaDeptoIndustrial_115_88_1= new Punto(115,88,1);
                Nodo puntoEntreEscalerasPiso1CercaDeptoIndustrial_115_88_1= new Nodo(puntoPuntoEntreEscalerasPiso1CercaDeptoIndustrial_115_88_1, "PUNTOENTREESCALERASPISO1CERCADEPTOINDUSTRIAL");
                

		Punto puntoIngreso_102_40_0= new Punto(102, 40, 0);
		Nodo ingreso_102_40_0 = new Nodo(puntoIngreso_102_40_0, "INGRESO");

		Punto puntoFagdutPrimerPiso_104_30_0= new Punto(104,30, 0);
		Nodo fagdut_104_30_0 = new Nodo(puntoFagdutPrimerPiso_104_30_0, "FAGDUTPRIMERPISO");
		
		Punto puntoAula1_110_30_0 = new Punto(110,30,0);
		Nodo aula1_110_30_0= new Nodo(puntoAula1_110_30_0,"AULA1");
                
                Punto puntoHall_108_39_0= new Punto(108,39,0);
                Nodo hall_108_39_0= new Nodo(puntoHall_108_39_0, "HALL");
                
                Punto puntoEscaleraHall_103_33_0= new Punto(103,33,0);
                NodoEscalera escaleraHall_103_33_0= new NodoEscalera(puntoEscaleraHall_103_33_0, "ESCALERAHALL");
                                
                Punto puntoAula1_110_31_0= new Punto(110,31,0);
                Nodo aula1_110_31_0= new Nodo(puntoAula1_110_31_0, "AULA1");

                Punto puntoLibreria_119_36_0= new Punto(119,36,0);
                Nodo libreria_119_36_0= new Nodo(puntoLibreria_119_36_0, "LIBRERIA");

                Punto puntoAula2_122_33_0= new Punto(122,33,0);
                Nodo aula2_122_33_0= new Nodo(puntoAula2_122_33_0, "AULA2");

                Punto puntoAula3_128_33_0= new Punto(128,33,0);
                Nodo aula3_128_33_0= new Nodo(puntoAula3_128_33_0, "AULA3");
                
                Punto puntoAula4_134_33_0= new Punto(134,33,0);
                Nodo aula4_134_33_0= new Nodo(puntoAula4_134_33_0, "AULA4");
                
                Punto puntoAula5_140_33_0= new Punto(140,33,0);
                Nodo aula5_140_33_0= new Nodo(puntoAula5_140_33_0, "AULA5");
                
                Punto puntoAula6_146_33_0= new Punto(146,33,0);
                Nodo aula6_146_33_0= new Nodo(puntoAula6_146_33_0, "AULA6");
                
                Punto puntoAulaInformatica_152_33_0= new Punto(152,33,0);
                Nodo aulaInformatica_152_33_0= new Nodo(puntoAulaInformatica_152_33_0, "AULAINFORMATICA");
                
                Punto puntoLabQuimica_158_34_0= new Punto(158,34,0);
                Nodo labQuimica_158_34_0= new Nodo(puntoLabQuimica_158_34_0, "LABQUIMICA");
                
                Punto puntoLabFisica_158_38_0= new Punto(158,38,0);
                Nodo labFisica_158_38_0= new Nodo(puntoLabFisica_158_38_0, "LABFISICA");
                
                Punto puntoLabMetales_143_37_0= new Punto(143,37,0);
                Nodo labMetales_143_37_0= new Nodo(puntoLabMetales_143_37_0, "LABMETALES");
                
                Punto puntoLabFluidica_143_37_0= new Punto(143,37,0);
                Nodo labFluidica_143_37_0= new Nodo(puntoLabFluidica_143_37_0, "LABFLUIDICA");
                
                Punto puntoLaboratorioFlow_138_48_0= new Punto(138,48,0);
                Nodo laboratorioFlow_138_48_0= new Nodo(puntoLaboratorioFlow_138_48_0, "LABORATORIOFLOW");
                
                Punto puntoSanitariosHall_127_41_0= new Punto(127,41,0);
                Nodo sanitariosHall_127_41_0= new Nodo(puntoSanitariosHall_127_41_0, "SANITARIOSHALL");
                
                Punto puntoEscaleraBanosHall_115_47_0= new Punto(115,47,0);
                NodoEscalera escaleraBanosHall_115_47_0= new NodoEscalera(puntoEscaleraBanosHall_115_47_0, "ESCALERABANOSHALL");
                                
                Punto puntoGiedi_114_43_0= new Punto(114,43,0);
                Nodo giedi_114_43_0= new Nodo(puntoGiedi_114_43_0, "GIEDI");
                
                Punto puntoInformes_110_44_0= new Punto(110,44,0);
                Nodo informes_110_44_0= new Nodo(puntoInformes_110_44_0, "INFORMES");
                
                Punto puntoEscaleraDeptoMecanica_113_61_0= new Punto(113,61,0);
                NodoEscalera escaleraDeptoMecanica_113_61_0= new NodoEscalera(puntoEscaleraDeptoMecanica_113_61_0, "ESCALERADEPTOMECANICA");
                
                Punto puntoDeptoMecanica_110_54_0= new Punto(110,54,0);
                Nodo deptoMecanica_110_54_0= new Nodo(puntoDeptoMecanica_110_54_0, "DEPTOMECANICA");
                
                Punto puntoCantina_83_34_0= new Punto(83,34,0);
                Nodo cantina_83_34_0= new Nodo(puntoCantina_83_34_0, "CANTINA");
                
                Punto puntoCentroEstudiantes_84_41_0= new Punto(84,41,0);
                Nodo centroEstudiantes_84_41_0= new Nodo(puntoCentroEstudiantes_84_41_0, "CENTROESTUDIANTES");
                
                Punto puntoBiblioteca_82_47_0= new Punto(82,47,0);
                Nodo biblioteca_82_47_0= new Nodo(puntoBiblioteca_82_47_0, "BIBLIOTECA");
                
                Punto puntoDirAcademica_82_65_0= new Punto(82,65,0);
                Nodo dirAcademica_82_65_0= new Nodo(puntoDirAcademica_82_65_0, "DIRACADEMICA");
                
                Punto puntoAlumnado_82_68_0= new Punto(82,68,0);
                Nodo alumnado_82_68_0= new Nodo(puntoAlumnado_82_68_0, "ALUMNADO");
                
                Punto puntoIngresoTorreAdm_82_86_0= new Punto(82,86,0);
                Nodo ingresoTorreAdm_82_86_0= new Nodo(puntoIngresoTorreAdm_82_86_0, "INGRESOTORREADM");
                
                Punto puntoOficinaGraduados_70_84_0= new Punto(70,84,0);
                Nodo oficinaGraduados_70_84_0= new Nodo(puntoOficinaGraduados_70_84_0, "OFICINAGRADUADOS");
                
                Punto puntoPasilloAEstadio_62_86_0= new Punto(62,86,0);
                Nodo pasilloAEstadio_62_86_0= new Nodo(puntoPasilloAEstadio_62_86_0, "PASILLOAESTADIO");
                
                Punto puntoPasilloAEstadio_74_86_0= new Punto(74,86,0);
                Nodo pasilloAEstadio_74_86_0= new Nodo(puntoPasilloAEstadio_74_86_0, "PASILLOAESTADIO");
                
                Punto puntoEntrePasilloEstadioYEscaleraTorreAdm_69_88_0= new Punto(69,88,0);
                Nodo entrePasilloEstadioYEscaleraTorreAdm_69_88_0= new Nodo(puntoEntrePasilloEstadioYEscaleraTorreAdm_69_88_0, "PUNTOENTREPASILLOESTADIOYESCALERATORREADM");
                
                Punto puntoEscalera1PisoTorreAdm_68_89_0= new Punto(68,89,0);
                NodoEscalera escalera1PisoTorreAdm_68_89_0= new NodoEscalera(puntoEscalera1PisoTorreAdm_68_89_0, "ESCALERA1PISOTORREADM");
                
                Punto puntoPasilloAEstadio1_45_86_0= new Punto(45,86,0);
                Nodo pasilloAEstadio1_45_86_0= new Nodo(puntoPasilloAEstadio1_45_86_0, "PASILLOAESTADIO1");
                
                Punto puntoIngresoTribunaOeste_33_91_0= new Punto(33,91,0);
                Nodo ingresoTribunaOeste_33_91_0= new Nodo(puntoIngresoTribunaOeste_33_91_0, "INGRESOTRIBUNAOESTE");
                
                Punto puntoEscaleraIngresoTribunaOeste_27_91_0= new Punto(27,91,0);
                NodoEscalera escaleraIngresoTribunaOeste_27_91_0= new NodoEscalera(puntoEscaleraIngresoTribunaOeste_27_91_0, "ESCALERAINGRESOTRIBUNAOESTE");
                
                Punto puntoHallEstadio_33_77_0= new Punto(33,77,0);
                Nodo hallEstadio_33_77_0= new Nodo(puntoHallEstadio_33_77_0, "HALLESTADIO");
                
                Punto puntoPasilloDeptoMecanica_111_61_0= new Punto(111,61,0);
                Nodo pasilloDeptoMecanica_111_61_0= new Nodo(puntoPasilloDeptoMecanica_111_61_0, "PASILLODEPTOMECANICA");
                
                Punto puntoPasilloPatioPalmeras_111_63_0= new Punto(111,63,0);
                Nodo pasilloPatioPalmeras_111_63_0= new Nodo(puntoPasilloPatioPalmeras_111_63_0, "PASILLOPATIOPALMERAS");
                
                Punto puntoEntradaDeptoElectrica_118_63_0= new Punto(118,63,0);
                Nodo entradaDeptoElectrica_118_63_0= new Nodo(puntoEntradaDeptoElectrica_118_63_0, "ENTRADADEPTOELECTRICA");
                
                Punto puntoEscaleraDeptoElectrica_121_63_0= new Punto(121,63,0);
                NodoEscalera escaleraDeptoElectrica_121_63_0= new NodoEscalera(puntoEscaleraDeptoElectrica_121_63_0, "ESCALERADEPTOELECTRICA");
                                
                Punto puntoDeptoElectrica_121_66_0= new Punto(121,66,0);
                Nodo deptoElectrica_121_66_0= new Nodo(puntoDeptoElectrica_121_66_0, "DEPTOELECTRICA");
                
                Punto puntoPasilloPatioPalmeras1_111_72_0= new Punto(111,72,0);
                Nodo pasilloPatioPalmeras1_111_72_0= new Nodo(puntoPasilloPatioPalmeras1_111_72_0, "PASILLOPATIOPALMERAS1");
                
                Punto puntoPasilloPatioPalmeras2_111_84_0= new Punto(111,84,0);
                Nodo pasilloPatioPalmeras2_111_84_0= new Nodo(puntoPasilloPatioPalmeras2_111_84_0, "PASILLOPATIOPALMERAS2");
                
                Punto puntoPasilloPatioPalmeras3_117_87_0= new Punto(117,87,0);
                Nodo pasilloPatioPalmeras3_117_87_0= new Nodo(puntoPasilloPatioPalmeras3_117_87_0, "PASILLOPATIOPALMERAS3");
                
                Punto puntoEscaleraPatioPalmeras_117_89_0= new Punto(117,89,0);
                NodoEscalera escaleraPatioPalmeras_117_89_0= new NodoEscalera(puntoEscaleraPatioPalmeras_117_89_0, "ESCALERAPATIOPALMERAS");
                
                Punto puntoAscensorPB_115_84_0= new Punto(115,84,0);
                NodoAscensor ascensorPB_115_84_0= new NodoAscensor(puntoAscensorPB_115_84_0, "ASCENSORPB");
                
                Punto puntoEntradaDeptoElectrica2_118_87_0= new Punto(118,87,0);
                Nodo entradaDeptoElectrica2_118_87_0= new Nodo(puntoEntradaDeptoElectrica2_118_87_0, "ENTRADADEPTOELECTRICA2");
                
                Punto puntoAulaD006_122_84_0= new Punto(122,84,0);
                Nodo aulaD006_122_84_0= new Nodo(puntoAulaD006_122_84_0, "AULAD006");
                
                Punto puntoAulaD007_124_84_0= new Punto(124,84,0);
                Nodo aulaD007_124_84_0= new Nodo(puntoAulaD007_124_84_0, "AULAD007");
                
                Punto puntoAula9_104_30_1= new Punto(104,30,1);
                Nodo aula9_104_30_1= new Nodo(puntoAula9_104_30_1, "AULA9");
                
                Punto puntoAula10_110_30_1= new Punto(110,30,1);
                Nodo aula10_110_30_1= new Nodo(puntoAula10_110_30_1, "AULA10");
                
                Punto puntoPuntoCercaAula10_119_30_1= new Punto(119,30,1);
                Nodo puntoCercaAula10_119_30_1= new Nodo(puntoPuntoCercaAula10_119_30_1, "PUNTOCERCAAULA10");
                
                Punto puntoPuntoCercaInformaticaBasicas_119_34_1= new Punto(119,34,1);
                Nodo puntoCercaInformaticaBasicas_119_34_1= new Nodo(puntoPuntoCercaInformaticaBasicas_119_34_1, "PUNTOCERCAINFORMATICABASICAS");
                
                Punto puntoSalaInformaticaBasicas_120_36_0= new Punto(120,36,0);
                Nodo salaInformaticaBasicas_120_36_0= new Nodo(puntoSalaInformaticaBasicas_120_36_0, "SALAINFORMATICABASICAS");
                
                Punto puntoAula11_122_33_1= new Punto(122,33,1);
                Nodo aula11_122_33_1= new Nodo(puntoAula11_122_33_1, "AULA11");
                
                Punto puntoAula12_128_33_1= new Punto(128,33,1);
                Nodo aula12_128_33_1= new Nodo(puntoAula12_128_33_1, "AULA12");
                
                Punto puntoPuntoCercaAula12_131_35_1= new Punto(131,35,1);
                Nodo puntoCercaAula12_131_35_1= new Nodo(puntoPuntoCercaAula12_131_35_1, "PUNTOCERCAAULA12");
                
                Punto puntoAula13_134_33_1= new Punto(134,33,1);
                Nodo aula13_134_33_1= new Nodo(puntoAula13_134_33_1, "AULA13");
                
                Punto puntoAula14_140_33_1= new Punto(140,33,1);
                Nodo aula14_140_33_1= new Nodo(puntoAula14_140_33_1, "AULA14");
                
                Punto puntoAula15_146_33_1= new Punto(146,33,1);
                Nodo aula15_146_33_1= new Nodo(puntoAula15_146_33_1, "AULA15");
                
                Punto puntoAula16_152_33_1= new Punto(152,33,1);
                Nodo aula16_152_33_1= new Nodo(puntoAula16_152_33_1, "AULA16");
                
                Punto puntoAula17_158_34_1= new Punto(158,34,1);
                Nodo aula17_158_34_1= new Nodo(puntoAula17_158_34_1, "AULA17");
                
                Punto puntoAula18_158_38_1= new Punto(158,38,1);
                Nodo aula18_158_38_1= new Nodo(puntoAula18_158_38_1, "AULA18");
                
                Punto puntoPuntoCercaAula14_142_35_1= new Punto(142,35,1);
                Nodo puntoCercaAula14_142_35_1= new Nodo(puntoPuntoCercaAula14_142_35_1, "PUNTOCERCAAULA14");
                
                Punto puntoAula19_141_37_1= new Punto(141,37,1);
                Nodo aula19_141_37_1= new Nodo(puntoAula19_141_37_1, "AULA19");
                
                Punto puntoPuntoCercaAula19_142_44_1= new Punto(142,44,1);
                Nodo puntoCercaAula19_142_44_1= new Nodo(puntoPuntoCercaAula19_142_44_1, "PUNTOCERCAAULA19");
                
                Punto puntoPuntoCercaAula19_137_48_1= new Punto(137,48,1);
                Nodo puntoCercaAula19_137_48_1= new Nodo(puntoPuntoCercaAula19_137_48_1, "PUNTOCERCAAULA19");
                
                Punto puntoPuntoCercaAula19_127_48_1= new Punto(127,48,1);
                Nodo puntoCercaAula19_127_48_1= new Nodo(puntoPuntoCercaAula19_127_48_1, "PUNTOCERCAAULA19");
                
                Punto puntoSanitariosCercaAula19_127_42_0= new Punto(127,42,0);
                Nodo sanitariosCercaAula19_127_42_0= new Nodo(puntoSanitariosCercaAula19_127_42_0, "SANITARIOSCERCAAULA19");
                
                Punto puntoPuntoPasilloCercaGimni_136_54_1= new Punto(136,54,1);
                Nodo puntoPasilloCercaGimni_136_54_1= new Nodo(puntoPuntoPasilloCercaGimni_136_54_1, "PUNTOPASILLOCERCAGIMNI");
                
                Punto puntoPuntoCercaAulaMateriales_136_61_1= new Punto(136,61,1);
                Nodo puntoCercaAulaMateriales_136_61_1= new Nodo(puntoPuntoCercaAulaMateriales_136_61_1, "PUNTOCERCAAULAMATERIALES");
                
                Punto puntoAulaMateriales_138_63_1= new Punto(138,63,1);
                Nodo aulaMateriales_138_63_1= new Nodo(puntoAulaMateriales_138_63_1, "AULAMATERIALES");
                
                Punto puntoPuntoCercaAulaMateriales_136_65_1= new Punto(136,65,1);
                Nodo puntoCercaAulaMateriales_136_65_1= new Nodo(puntoPuntoCercaAulaMateriales_136_65_1, "PUNTOCERCAAULAMATERIALES");
                
                Punto puntoSanitariosCercaCecovi_131_63_1= new Punto(131,63,1);
                Nodo sanitariosCercaCecovi_131_63_1= new Nodo(puntoSanitariosCercaCecovi_131_63_1, "SANITARIOSCERCACECOVI");
                
                Punto puntoPuntoCercaCecovi_121_66_1= new Punto(121,66,1);
                Nodo puntoCercaCecovi_121_66_1= new Nodo(puntoPuntoCercaCecovi_121_66_1, "PUNTOCERCACECOVI");
                
                Punto puntoPuntoCercaTutoriaB1_107_36_1= new Punto(107,36,1);
                Nodo puntoCercaTutoriaB1_107_36_1= new Nodo(puntoPuntoCercaTutoriaB1_107_36_1, "PUNTOCERCATUTORIAB1");
                
                Punto puntoTutoriaB1_106_39_1= new Punto(106,39,1);
                Nodo tutoriaB1_106_39_1= new Nodo(puntoTutoriaB1_106_39_1, "TUTORIAB1");
                
                Punto puntoSalaInformaticaBasicas_107_40_1= new Punto(107,40,1);
                Nodo salaInformaticaBasicas_107_40_1= new Nodo(puntoSalaInformaticaBasicas_107_40_1, "SALAINFORMATICABASICAS");
                
                Punto puntoMateriasBasicas_107_41_1= new Punto(107,41,1);
                Nodo materiasBasicas_107_41_1= new Nodo(puntoMateriasBasicas_107_41_1, "MATERIASBASICAS");
                
                Punto puntoTutoriaB2_106_43_1= new Punto(106,43,1);
                Nodo tutoriaB2_106_43_1= new Nodo(puntoTutoriaB2_106_43_1, "TUTORIAB2");
                
                Punto puntoTutoriaB3_106_45_1= new Punto(106,45,1);
                Nodo tutoriaB3_106_45_1= new Nodo(puntoTutoriaB3_106_45_1, "TUTORIAB3");
                
                Punto puntoPuntoCercaTotoriaB3_107_48_1= new Punto(107,48,1);
                Nodo puntoCercaTotoriaB3_107_48_1= new Nodo(puntoPuntoCercaTotoriaB3_107_48_1, "PUNTOCERCATOTORIAB3");
                
                Punto puntoTutoriaB4_99_48_1= new Punto(99,48,1);
                Nodo tutoriaB4_99_48_1= new Nodo(puntoTutoriaB4_99_48_1, "TUTORIAB4");
                
                Punto puntoTutoriaB5_95_169_1= new Punto(95,169,1);
                Nodo tutoriaB5_95_169_1= new Nodo(puntoTutoriaB5_95_169_1, "TUTORIAB5");
                
                Punto puntoPasilloSalaEstudioBasicas_107_56_1= new Punto(107,56,1);
                Nodo pasilloSalaEstudioBasicas_107_56_1= new Nodo(puntoPasilloSalaEstudioBasicas_107_56_1, "PASILLOSALAESTUDIOBASICAS");
                
                Punto puntoPasilloSalaEstudioBasicas_107_60_1= new Punto(107,60,1);
                Nodo pasilloSalaEstudioBasicas_107_60_1= new Nodo(puntoPasilloSalaEstudioBasicas_107_60_1, "PASILLOSALAESTUDIOBASICAS");
                
                Punto puntoPuntoCercaAula20_112_61_1= new Punto(112,61,1);
                Nodo puntoCercaAula20_112_61_1= new Nodo(puntoPuntoCercaAula20_112_61_1, "PUNTOCERCAAULA20");
                
                Punto puntoAulaFagdut_118_59_1= new Punto(118,59,1);
                Nodo aulaFagdut_118_59_1= new Nodo(puntoAulaFagdut_118_59_1, "AULAFAGDUT");
                
                Punto puntoAula20_119_60_1= new Punto(119,60,1);
                Nodo aula20_119_60_1= new Nodo(puntoAula20_119_60_1, "AULA20");
                
                Punto puntoPuntoCercaDeptoCivil_112_66_1= new Punto(112,66,1);
                Nodo puntoCercaDeptoCivil_112_66_1= new Nodo(puntoPuntoCercaDeptoCivil_112_66_1, "PUNTOCERCADEPTOCIVIL");
                
                Punto puntoDeptoCivil_111_71_1= new Punto(111,71,1);
                Nodo deptoCivil_111_71_1= new Nodo(puntoDeptoCivil_111_71_1, "DEPTOCIVIL");
                
                Punto puntoPasilloDeptoCivil_112_78_1= new Punto(112,78,1);
                Nodo pasilloDeptoCivil_112_78_1= new Nodo(puntoPasilloDeptoCivil_112_78_1, "PASILLODEPTOCIVIL");
                
                Punto puntoPuntoEntreDeptoCivilEIndustrial_112_84_1= new Punto(112,84,1);
                Nodo puntoEntreDeptoCivilEIndustrial_112_84_1= new Nodo(puntoPuntoEntreDeptoCivilEIndustrial_112_84_1, "PUNTOENTREDEPTOCIVILEINDUSTRIAL");
                
                Punto puntoDeptoIndustrial_119_87_1= new Punto(119,87,1);
                Nodo deptoIndustrial_119_87_1= new Nodo(puntoDeptoIndustrial_119_87_1, "DEPTOINDUSTRIAL");
                
                Punto puntoPuntoEntreEscalerasDeptoIndustrial_116_89_1= new Punto(116,89,1);
                Nodo puntoEntreEscalerasDeptoIndustrial_116_89_1= new Nodo(puntoPuntoEntreEscalerasDeptoIndustrial_116_89_1, "PUNTOENTREESCALERASDEPTOINDUSTRIAL");
                                
                Punto puntoPuntoPasilloSalaEstudioPosgrado_103_86_1= new Punto(103,86,1);
                Nodo puntoPasilloSalaEstudioPosgrado_103_86_1= new Nodo(puntoPuntoPasilloSalaEstudioPosgrado_103_86_1, "PUNTOPASILLOSALAESTUDIOPOSGRADO");
                
                Punto puntoPuntoPasilloSalaEstudioPosgrado_91_86_1= new Punto(91,86,1);
                Nodo puntoPasilloSalaEstudioPosgrado_91_86_1= new Nodo(puntoPuntoPasilloSalaEstudioPosgrado_91_86_1, "PUNTOPASILLOSALAESTUDIOPOSGRADO");
                
                Punto puntoPuntoPasilloPosgrado_84_86_1= new Punto(84,86,1);
                Nodo puntoPasilloPosgrado_84_86_1= new Nodo(puntoPuntoPasilloPosgrado_84_86_1, "PUNTOPASILLOPOSGRADO");
                
                Punto puntoPuntoAAulasEXX_83_74_1= new Punto(83,74,1);
                Nodo puntoAAulasEXX_83_74_1= new Nodo(puntoPuntoAAulasEXX_83_74_1, "PUNTOAAULASEXX");
                
                Punto puntoAulaE3_82_72_1= new Punto(82,72,1);
                Nodo aulaE3_82_72_1= new Nodo(puntoAulaE3_82_72_1, "AULAE3");
                
                Punto puntoAulaE2_82_62_1= new Punto(82,62,1);
                Nodo aulaE2_82_62_1= new Nodo(puntoAulaE2_82_62_1, "AULAE2");
                
                Punto puntoAulaE1_82_55_1= new Punto(82,55,1);
                Nodo aulaE1_82_55_1= new Nodo(puntoAulaE1_82_55_1, "AULAE1");
                
                Punto puntoAulaVideoconferencia_82_51_1= new Punto(82,51,1);
                Nodo aulaVideoconferencia_82_51_1= new Nodo(puntoAulaVideoconferencia_82_51_1, "AULAVIDEOCONFERENCIA");
                
                Punto puntoPuntoPasilloPosgrado_70_86_1= new Punto(70,86,1);
                Nodo puntoPasilloPosgrado_70_86_1= new Nodo(puntoPuntoPasilloPosgrado_70_86_1, "PUNTOPASILLOPOSGRADO");
                
                Punto puntoPuntoCercaSecAcademica_69_89_1= new Punto(69,89,1);
                Nodo puntoCercaSecAcademica_69_89_1= new Nodo(puntoPuntoCercaSecAcademica_69_89_1, "PUNTOCERCASECACADEMICA");
                
                Punto puntoSecAcademica_72_91_1= new Punto(72,91,1);
                Nodo secAcademica_72_91_1= new Nodo(puntoSecAcademica_72_91_1, "SECACADEMICA");
                
                Punto puntoPuntoPasilloPosgrado_65_86_1= new Punto(65,86,1);
                Nodo puntoPasilloPosgrado_65_86_1= new Nodo(puntoPuntoPasilloPosgrado_65_86_1, "PUNTOPASILLOPOSGRADO");
                
                Punto puntoPosgrado_60_88_1= new Punto(60,88,1);
                Nodo posgrado_60_88_1= new Nodo(puntoPosgrado_60_88_1, "POSGRADO");
                
                Punto puntoAulaMM5_64_83_1= new Punto(64,83,1);
                Nodo aulaMM5_64_83_1= new Nodo(puntoAulaMM5_64_83_1, "AULAMM5");
                
                Punto puntoPuntoPasilloMM_51_86_1= new Punto(51,86,1);
                Nodo puntoPasilloMM_51_86_1= new Nodo(puntoPuntoPasilloMM_51_86_1, "PUNTOPASILLOMM");
                
                Punto puntoAulaMM1_52_88_1= new Punto(52,88,1);
                Nodo aulaMM1_52_88_1= new Nodo(puntoAulaMM1_52_88_1, "AULAMM1");
                
                Punto puntoAulaCisco_50_84_1= new Punto(50,84,1);
                Nodo aulaCisco_50_84_1= new Nodo(puntoAulaCisco_50_84_1, "AULACISCO");
                
                Punto puntoAulaMM2_49_88_1= new Punto(49,88,1);
                Nodo aulaMM2_49_88_1= new Nodo(puntoAulaMM2_49_88_1, "AULAMM2");
                
                Punto puntoAulaMM3_42_88_1= new Punto(42,88,1);
                Nodo aulaMM3_42_88_1= new Nodo(puntoAulaMM3_42_88_1, "AULAMM3");
                
                Punto puntoAulaCiscoBB_38_84_1= new Punto(38,84,1);
                Nodo aulaCiscoBB_38_84_1= new Nodo(puntoAulaCiscoBB_38_84_1, "AULACISCOBB");
                
                Punto puntoPuntoPasilloMM_37_86_1= new Punto(37,86,1);
                Nodo puntoPasilloMM_37_86_1= new Nodo(puntoPuntoPasilloMM_37_86_1, "PUNTOPASILLOMM");
                
                Punto puntoAulaMM4_36_84_1= new Punto(36,84,1);
                Nodo aulaMM4_36_84_1= new Nodo(puntoAulaMM4_36_84_1, "AULAMM4");
                
                Punto puntoPuntoPasilloMM_31_86_1= new Punto(31,86,1);
                Nodo puntoPasilloMM_31_86_1= new Nodo(puntoPuntoPasilloMM_31_86_1, "PUNTOPASILLOMM");
                
                Punto puntoHallPlateasAltas_26_83_1= new Punto(26,83,1);
                Nodo hallPlateasAltas_26_83_1= new Nodo(puntoHallPlateasAltas_26_83_1, "HALLPLATEASALTAS");

                Punto puntoPasilloAHallPlateasAltas_28_89_1= new Punto(28,89,1);
                Nodo pasilloAHallPlateasAltas_28_89_1= new Nodo(puntoPasilloAHallPlateasAltas_28_89_1, "PASILLOAHALLPLATEASALTAS");
                
                Punto puntoSanitariosHallPlateasAltas_28_93_1= new Punto(28,93,1);
                Nodo sanitariosHallPlateasAltas_28_93_1= new Nodo(puntoSanitariosHallPlateasAltas_28_93_1, "SANITARIOSHALLPLATEASALTAS");
                
                Punto puntoJavalab_128_63_2= new Punto(128,63,2);
                Nodo javalab_128_63_2= new Nodo(puntoJavalab_128_63_2, "JAVALAB");
                
                Punto puntoEscaleraCercaJavalab_128_64_2= new Punto(128,64,2);
                NodoEscalera escaleraCercaJavalab_128_64_2= new NodoEscalera(puntoEscaleraCercaJavalab_128_64_2, "ESCALERACERCAJAVALAB");
                
                Punto puntoPasilloFrenteJavaLab_131_64_2= new Punto(131,64,2);
                Nodo pasilloFrenteJavaLab_131_64_2= new Nodo(puntoPasilloFrenteJavaLab_131_64_2, "PASILLOFRENTEJAVALAB");
                
                Punto puntoPasilloAula21_132_70_2= new Punto(132,70,2);
                Nodo pasilloAula21_132_70_2= new Nodo(puntoPasilloAula21_132_70_2, "PASILLOAULA21");
                
                Punto puntoAula21_132_75_2= new Punto(132,75,2);
                Nodo aula21_132_75_2= new Nodo(puntoAula21_132_75_2, "AULA21");
                
                pasilloFrenteJavaLab_131_64_2.setOeste(pasilloAula21_132_70_2);
                pasilloFrenteJavaLab_131_64_2.setSur();
                pasilloFrenteJavaLab_131_64_2.setSureste(javalab_128_63_2);
                
                Punto puntoAnexoISI_137_67_2= new Punto(137,67,2);
                Nodo anexoISI_137_67_2= new Nodo(puntoAnexoISI_137_67_2, "ANEXOISI");
                
                Punto puntoPuntoCercaAula22_136_64_2= new Punto(136,64,2);
                Nodo puntoCercaAula22_136_64_2= new Nodo(puntoPuntoCercaAula22_136_64_2, "PUNTOCERCAAULA22");
                
                puntoCercaAula22_136_64_2.setSur(pasilloFrenteJavaLab_131_64_2);
                
                Punto puntoAula22_138_63_2= new Punto(138,63,2);
                Nodo aula22_138_63_2= new Nodo(puntoAula22_138_63_2, "AULA22");
                
                aula22_138_63_2.setOeste(anexoISI_137_67_2);
                aula22_138_63_2.setSur(puntoCercaAula22_136_64_2);
                
                Punto puntoEscaleraCercaAnexo_136_66_2= new Punto(136,66,2);
                NodoEscalera escaleraCercaAnexo_136_66_2= new NodoEscalera(puntoEscaleraCercaAnexo_136_66_2, "ESCALERACERCAANEXO");
                
                escaleraCercaAnexo_136_66_2.setNoroeste(anexoISI_137_67_2);
                escaleraCercaAnexo_136_66_2.setNoreste(aula22_138_63_2);
                escaleraCercaAnexo_136_66_2.setSur(puntoCercaAula22_136_64_2);
                
                Punto puntoEscaleraCercaAnexo_133_66_3= new Punto(133,66,3);
                NodoEscalera escaleraCercaAnexo_133_66_3= new NodoEscalera(puntoEscaleraCercaAnexo_133_66_3, "ESCALERACERCAANEXO");
                
                escaleraCercaAnexo_133_66_3.setEscalera(escaleraCercaAnexo_136_66_2);
                                
                Punto puntoPuntoCercaEscaleraAnexo_131_66_3= new Punto(131,66,3);
                Nodo puntoCercaEscaleraAnexo_131_66_3= new Nodo(puntoPuntoCercaEscaleraAnexo_131_66_3, "PUNTOCERCAESCALERAANEXO");
                
                puntoCercaEscaleraAnexo_131_66_3.setNorte(escaleraCercaAnexo_133_66_3);
                
                Punto puntoPuntoPasilloDeptoISI_131_61_3= new Punto(131,61,3);
                Nodo puntoPasilloDeptoISI_131_61_3= new Nodo(puntoPuntoPasilloDeptoISI_131_61_3, "PUNTOPASILLODEPTOISI");
                
                puntoPasilloDeptoISI_131_61_3.setOeste(puntoCercaEscaleraAnexo_131_66_3);
                               
                Punto puntoPuntoPasilloDeptoISI_139_61_3= new Punto(139,61,3);
                Nodo puntoPasilloDeptoISI_139_61_3= new Nodo(puntoPuntoPasilloDeptoISI_139_61_3, "PUNTOPASILLODEPTOISI");
                
                puntoPasilloDeptoISI_139_61_3.setSur(puntoPasilloDeptoISI_131_61_3);
                
                Punto puntoLab1_134_59_3= new Punto(134,59,3);
                Nodo lab1_134_59_3= new Nodo(puntoLab1_134_59_3, "LAB1");
                
                lab1_134_59_3.setNoroeste(puntoPasilloDeptoISI_139_61_3);
                lab1_134_59_3.setSuroeste(puntoPasilloDeptoISI_131_61_3);
                
                Punto puntoPuntoPasilloDeptoISI_150_61_3= new Punto(150,61,3);
                Nodo puntoPasilloDeptoISI_150_61_3= new Nodo(puntoPuntoPasilloDeptoISI_150_61_3, "PUNTOPASILLODEPTOISI");
                
                puntoPasilloDeptoISI_150_61_3.setSur(puntoPasilloDeptoISI_139_61_3);
                
                Punto puntoLabConectividad_144_59_3= new Punto(144,59,3);
                Nodo labConectividad_144_59_3= new Nodo(puntoLabConectividad_144_59_3, "LABCONECTIVIDAD");
                
                labConectividad_144_59_3.setNoroeste(puntoPasilloDeptoISI_150_61_3);
                labConectividad_144_59_3.setSuroeste(puntoPasilloDeptoISI_139_61_3);
                
                Punto puntoPuntoEntreLab4y5_153_60_3= new Punto(153,60,3);
                Nodo puntoEntreLab4y5_153_60_3= new Nodo(puntoPuntoEntreLab4y5_153_60_3, "PUNTOENTRELAB4Y5");
                                                
                Punto puntoLab5_154_61_3= new Punto(154,61,3);
                Nodo lab5_154_61_3= new Nodo(puntoLab5_154_61_3, "LAB5");
                                               
                Punto puntoLab4_154_56_3= new Punto(154,56,3);
                Nodo lab4_154_56_3= new Nodo(puntoLab4_154_56_3, "LAB4");
                
                puntoEntreLab4y5_153_60_3.setNoroeste(lab5_154_61_3);
                puntoEntreLab4y5_153_60_3.setNoreste(lab4_154_56_3);
                puntoEntreLab4y5_153_60_3.setSur(puntoPasilloDeptoISI_150_61_3);
                
                lab4_154_56_3.setSuroeste(puntoPasilloDeptoISI_131_61_3);
                lab4_154_56_3.setNoroeste(puntoPasilloDeptoISI_139_61_3);
                
                Punto puntoCidisi_124_60_3= new Punto(124,60,3);
                Nodo cidisi_124_60_3= new Nodo(puntoCidisi_124_60_3, "CIDISI");
                
                cidisi_124_60_3.setNoroeste(puntoPasilloDeptoISI_131_61_3);
                
                Punto puntoDireccionDeptoISI_120_61_3= new Punto(120,61,3);
                Nodo direccionDeptoISI_120_61_3= new Nodo(puntoDireccionDeptoISI_120_61_3, "DIRECCIONDEPTOISI");
                
                Punto puntoPuntoPasilloCercaCidisi_122_61_3= new Punto(122,61,3);
                Nodo puntoPasilloCercaCidisi_122_61_3= new Nodo(puntoPuntoPasilloCercaCidisi_122_61_3, "PUNTOPASILLOCERCACIDISI");
                
                puntoPasilloCercaCidisi_122_61_3.setSur(direccionDeptoISI_120_61_3);
                puntoPasilloCercaCidisi_122_61_3.setNoreste(cidisi_124_60_3);
                puntoPasilloCercaCidisi_122_61_3.setNorte(puntoPasilloDeptoISI_131_61_3);
                
                Punto puntoPuntoPasilloCercaSoporte_122_66_3= new Punto(122,66,3);
                Nodo puntoPasilloCercaSoporte_122_66_3= new Nodo(puntoPuntoPasilloCercaSoporte_122_66_3, "PUNTOPASILLOCERCASOPORTE");
                
                puntoPasilloCercaSoporte_122_66_3.setEste(puntoPasilloCercaCidisi_122_61_3);
                
                Punto puntoSoporte_123_68_3= new Punto(123,68,3);
                Nodo soporte_123_68_3= new Nodo(puntoSoporte_123_68_3, "SOPORTE");
                
                soporte_123_68_3.setSureste(puntoPasilloCercaSoporte_122_66_3);
                
                Punto puntoPuntoPasilloCercaOficinaRomaniz_122_73_3= new Punto(122,73,3);
                Nodo puntoPasilloCercaOficinaRomaniz_122_73_3= new Nodo(puntoPuntoPasilloCercaOficinaRomaniz_122_73_3, "PUNTOPASILLOCERCAOFICINAROMANIZ");
                
                puntoPasilloCercaOficinaRomaniz_122_73_3.setEste(puntoPasilloCercaSoporte_122_66_3);
                puntoPasilloCercaOficinaRomaniz_122_73_3.setNoreste(soporte_123_68_3);
                
                Punto puntoPuntoPasilloCercaAulaEstudioOeste_122_80_3= new Punto(122,80,3);
                Nodo puntoPasilloCercaAulaEstudioOeste_122_80_3= new Nodo(puntoPuntoPasilloCercaAulaEstudioOeste_122_80_3, "PUNTOPASILLOCERCAAULAESTUDIOOESTE");
                
                puntoPasilloCercaAulaEstudioOeste_122_80_3.setEste(puntoPasilloCercaOficinaRomaniz_122_73_3);
                
                Punto puntoPuntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3= new Punto(122,84,3);
                Nodo puntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3= new Nodo(puntoPuntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3, "PUNTOPASILLOCERCAMESAESTUDIOYAULAESTUDIOOESTE");
                
                puntoPasilloCercaMesaEstudioYAulaEstudioOeste_122_84_3.setEste(puntoPasilloCercaAulaEstudioOeste_122_80_3);
                        
                Punto puntoPuntoCercaEscaleraTercerPiso_115_64_3= new Punto(115,64,3);
                Nodo puntoCercaEscaleraTercerPiso_115_64_3= new Nodo(puntoPuntoCercaEscaleraTercerPiso_115_64_3, "PUNTOENTREASCENSORYESCALERA");
                
                Punto puntoEscaleraCercaAscensor_115_89_3= new Punto(115,89,3);
                NodoEscalera escaleraCercaAscensor_115_89_3= new NodoEscalera(puntoEscaleraCercaAscensor_115_89_3, "ESCALERACERCAASCENSOR");

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
                }
	}
                
}

package EjercicioAsistencia;

public class servicio {
    private trabajadores empleado;
    private vehiculo vehiculo;
    private String desc;    

    /**
	 * @param empleado
	 * @param vehiculo
	 */
	public servicio(trabajadores empleado, vehiculo vehiculo) {
		this.empleado = empleado;
		this.vehiculo = vehiculo;
		this.desc = "";
	}

	public servicio() {
    	this.empleado = new trabajadores();
    	this.vehiculo = new vehiculo();
    	this.desc = "";
    }

	/**
	 * @return the empleado
	 */
	public trabajadores getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(trabajadores empleado) {
		this.empleado = empleado;
	}

	/**
	 * @return the vehiculo
	 */
	public vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Servicio [empleado=" + empleado + ", vehiculo=" + vehiculo + "]";
	}
	
}

package basicsOfCollection.BoundedQueue;

public class Song {
	
	private String name;
	private String singer;
	private String duration;
	private String writer;
	private String movie;
	
	private Song() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public String getSinger() {
		return singer;
	}

	public String getDuration() {
		return duration;
	}

	public String getWriter() {
		return writer;
	}

	public String getMovie() {
		return movie;
	}

	public Song(String name, String singer, String duration, String writer, String movie) {
		super();
		this.name = name;
		this.singer = singer;
		this.duration = duration;
		this.writer = writer;
		this.movie = movie;
	}

	public String toString() {
		return "Song [name=" + name + ", singer=" + singer + ", duration=" + duration + ", writer=" + writer
				+ ", movie=" + movie + "]";
	}
	
	public boolean equals(Object o)
	{
		Song s = (Song) o;
		return this.name.equalsIgnoreCase((s.name))&&this.singer.equalsIgnoreCase((s.singer))&&this.duration.equalsIgnoreCase((s.duration))
				&&this.writer.equalsIgnoreCase((s.writer))&&this.movie.equalsIgnoreCase((s.movie));
	}
	
	public int hashcode()
	{
		return name.hashCode()+singer.hashCode()+duration.hashCode()+writer.hashCode()+movie.hashCode();
	}
	
	
	

}

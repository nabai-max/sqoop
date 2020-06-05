// ORM class for table 'film'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 05 17:50:03 EDT 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class film extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("film_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.film_id = (Integer)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.title = (String)value;
      }
    });
    setters.put("description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.description = (String)value;
      }
    });
    setters.put("release_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.release_year = (Integer)value;
      }
    });
    setters.put("language_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.language_id = (Integer)value;
      }
    });
    setters.put("original_language_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.original_language_id = (Integer)value;
      }
    });
    setters.put("rental_duration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.rental_duration = (Integer)value;
      }
    });
    setters.put("rental_rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.rental_rate = (java.math.BigDecimal)value;
      }
    });
    setters.put("length", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.length = (Integer)value;
      }
    });
    setters.put("replacement_cost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.replacement_cost = (java.math.BigDecimal)value;
      }
    });
    setters.put("rating", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.rating = (String)value;
      }
    });
    setters.put("special_features", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.special_features = (String)value;
      }
    });
    setters.put("last_update", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        film.this.last_update = (java.sql.Timestamp)value;
      }
    });
  }
  public film() {
    init0();
  }
  private Integer film_id;
  public Integer get_film_id() {
    return film_id;
  }
  public void set_film_id(Integer film_id) {
    this.film_id = film_id;
  }
  public film with_film_id(Integer film_id) {
    this.film_id = film_id;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public film with_title(String title) {
    this.title = title;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public film with_description(String description) {
    this.description = description;
    return this;
  }
  private Integer release_year;
  public Integer get_release_year() {
    return release_year;
  }
  public void set_release_year(Integer release_year) {
    this.release_year = release_year;
  }
  public film with_release_year(Integer release_year) {
    this.release_year = release_year;
    return this;
  }
  private Integer language_id;
  public Integer get_language_id() {
    return language_id;
  }
  public void set_language_id(Integer language_id) {
    this.language_id = language_id;
  }
  public film with_language_id(Integer language_id) {
    this.language_id = language_id;
    return this;
  }
  private Integer original_language_id;
  public Integer get_original_language_id() {
    return original_language_id;
  }
  public void set_original_language_id(Integer original_language_id) {
    this.original_language_id = original_language_id;
  }
  public film with_original_language_id(Integer original_language_id) {
    this.original_language_id = original_language_id;
    return this;
  }
  private Integer rental_duration;
  public Integer get_rental_duration() {
    return rental_duration;
  }
  public void set_rental_duration(Integer rental_duration) {
    this.rental_duration = rental_duration;
  }
  public film with_rental_duration(Integer rental_duration) {
    this.rental_duration = rental_duration;
    return this;
  }
  private java.math.BigDecimal rental_rate;
  public java.math.BigDecimal get_rental_rate() {
    return rental_rate;
  }
  public void set_rental_rate(java.math.BigDecimal rental_rate) {
    this.rental_rate = rental_rate;
  }
  public film with_rental_rate(java.math.BigDecimal rental_rate) {
    this.rental_rate = rental_rate;
    return this;
  }
  private Integer length;
  public Integer get_length() {
    return length;
  }
  public void set_length(Integer length) {
    this.length = length;
  }
  public film with_length(Integer length) {
    this.length = length;
    return this;
  }
  private java.math.BigDecimal replacement_cost;
  public java.math.BigDecimal get_replacement_cost() {
    return replacement_cost;
  }
  public void set_replacement_cost(java.math.BigDecimal replacement_cost) {
    this.replacement_cost = replacement_cost;
  }
  public film with_replacement_cost(java.math.BigDecimal replacement_cost) {
    this.replacement_cost = replacement_cost;
    return this;
  }
  private String rating;
  public String get_rating() {
    return rating;
  }
  public void set_rating(String rating) {
    this.rating = rating;
  }
  public film with_rating(String rating) {
    this.rating = rating;
    return this;
  }
  private String special_features;
  public String get_special_features() {
    return special_features;
  }
  public void set_special_features(String special_features) {
    this.special_features = special_features;
  }
  public film with_special_features(String special_features) {
    this.special_features = special_features;
    return this;
  }
  private java.sql.Timestamp last_update;
  public java.sql.Timestamp get_last_update() {
    return last_update;
  }
  public void set_last_update(java.sql.Timestamp last_update) {
    this.last_update = last_update;
  }
  public film with_last_update(java.sql.Timestamp last_update) {
    this.last_update = last_update;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof film)) {
      return false;
    }
    film that = (film) o;
    boolean equal = true;
    equal = equal && (this.film_id == null ? that.film_id == null : this.film_id.equals(that.film_id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.release_year == null ? that.release_year == null : this.release_year.equals(that.release_year));
    equal = equal && (this.language_id == null ? that.language_id == null : this.language_id.equals(that.language_id));
    equal = equal && (this.original_language_id == null ? that.original_language_id == null : this.original_language_id.equals(that.original_language_id));
    equal = equal && (this.rental_duration == null ? that.rental_duration == null : this.rental_duration.equals(that.rental_duration));
    equal = equal && (this.rental_rate == null ? that.rental_rate == null : this.rental_rate.equals(that.rental_rate));
    equal = equal && (this.length == null ? that.length == null : this.length.equals(that.length));
    equal = equal && (this.replacement_cost == null ? that.replacement_cost == null : this.replacement_cost.equals(that.replacement_cost));
    equal = equal && (this.rating == null ? that.rating == null : this.rating.equals(that.rating));
    equal = equal && (this.special_features == null ? that.special_features == null : this.special_features.equals(that.special_features));
    equal = equal && (this.last_update == null ? that.last_update == null : this.last_update.equals(that.last_update));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof film)) {
      return false;
    }
    film that = (film) o;
    boolean equal = true;
    equal = equal && (this.film_id == null ? that.film_id == null : this.film_id.equals(that.film_id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.release_year == null ? that.release_year == null : this.release_year.equals(that.release_year));
    equal = equal && (this.language_id == null ? that.language_id == null : this.language_id.equals(that.language_id));
    equal = equal && (this.original_language_id == null ? that.original_language_id == null : this.original_language_id.equals(that.original_language_id));
    equal = equal && (this.rental_duration == null ? that.rental_duration == null : this.rental_duration.equals(that.rental_duration));
    equal = equal && (this.rental_rate == null ? that.rental_rate == null : this.rental_rate.equals(that.rental_rate));
    equal = equal && (this.length == null ? that.length == null : this.length.equals(that.length));
    equal = equal && (this.replacement_cost == null ? that.replacement_cost == null : this.replacement_cost.equals(that.replacement_cost));
    equal = equal && (this.rating == null ? that.rating == null : this.rating.equals(that.rating));
    equal = equal && (this.special_features == null ? that.special_features == null : this.special_features.equals(that.special_features));
    equal = equal && (this.last_update == null ? that.last_update == null : this.last_update.equals(that.last_update));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.film_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.description = JdbcWritableBridge.readString(3, __dbResults);
    this.release_year = JdbcWritableBridge.readInteger(4, __dbResults);
    this.language_id = JdbcWritableBridge.readInteger(5, __dbResults);
    this.original_language_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.rental_duration = JdbcWritableBridge.readInteger(7, __dbResults);
    this.rental_rate = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.length = JdbcWritableBridge.readInteger(9, __dbResults);
    this.replacement_cost = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.rating = JdbcWritableBridge.readString(11, __dbResults);
    this.special_features = JdbcWritableBridge.readString(12, __dbResults);
    this.last_update = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.film_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.description = JdbcWritableBridge.readString(3, __dbResults);
    this.release_year = JdbcWritableBridge.readInteger(4, __dbResults);
    this.language_id = JdbcWritableBridge.readInteger(5, __dbResults);
    this.original_language_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.rental_duration = JdbcWritableBridge.readInteger(7, __dbResults);
    this.rental_rate = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.length = JdbcWritableBridge.readInteger(9, __dbResults);
    this.replacement_cost = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.rating = JdbcWritableBridge.readString(11, __dbResults);
    this.special_features = JdbcWritableBridge.readString(12, __dbResults);
    this.last_update = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(film_id, 1 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(release_year, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(language_id, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(original_language_id, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(rental_duration, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(rental_rate, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(length, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(replacement_cost, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(rating, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(special_features, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_update, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(film_id, 1 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(release_year, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(language_id, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(original_language_id, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(rental_duration, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(rental_rate, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(length, 9 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(replacement_cost, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(rating, 11 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(special_features, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_update, 13 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.film_id = null;
    } else {
    this.film_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.release_year = null;
    } else {
    this.release_year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.language_id = null;
    } else {
    this.language_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.original_language_id = null;
    } else {
    this.original_language_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rental_duration = null;
    } else {
    this.rental_duration = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rental_rate = null;
    } else {
    this.rental_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.length = null;
    } else {
    this.length = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.replacement_cost = null;
    } else {
    this.replacement_cost = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.rating = null;
    } else {
    this.rating = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.special_features = null;
    } else {
    this.special_features = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_update = null;
    } else {
    this.last_update = new Timestamp(__dataIn.readLong());
    this.last_update.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.film_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.film_id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.release_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.release_year);
    }
    if (null == this.language_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.language_id);
    }
    if (null == this.original_language_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.original_language_id);
    }
    if (null == this.rental_duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rental_duration);
    }
    if (null == this.rental_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.rental_rate, __dataOut);
    }
    if (null == this.length) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.length);
    }
    if (null == this.replacement_cost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.replacement_cost, __dataOut);
    }
    if (null == this.rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rating);
    }
    if (null == this.special_features) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, special_features);
    }
    if (null == this.last_update) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_update.getTime());
    __dataOut.writeInt(this.last_update.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.film_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.film_id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.release_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.release_year);
    }
    if (null == this.language_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.language_id);
    }
    if (null == this.original_language_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.original_language_id);
    }
    if (null == this.rental_duration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rental_duration);
    }
    if (null == this.rental_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.rental_rate, __dataOut);
    }
    if (null == this.length) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.length);
    }
    if (null == this.replacement_cost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.replacement_cost, __dataOut);
    }
    if (null == this.rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rating);
    }
    if (null == this.special_features) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, special_features);
    }
    if (null == this.last_update) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_update.getTime());
    __dataOut.writeInt(this.last_update.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(film_id==null?"null":"" + film_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(release_year==null?"null":"" + release_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(language_id==null?"null":"" + language_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_language_id==null?"null":"" + original_language_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rental_duration==null?"null":"" + rental_duration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rental_rate==null?"null":rental_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(length==null?"null":"" + length, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(replacement_cost==null?"null":replacement_cost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating==null?"null":rating, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(special_features==null?"null":special_features, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_update==null?"null":"" + last_update, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(film_id==null?"null":"" + film_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(release_year==null?"null":"" + release_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(language_id==null?"null":"" + language_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_language_id==null?"null":"" + original_language_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rental_duration==null?"null":"" + rental_duration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rental_rate==null?"null":rental_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(length==null?"null":"" + length, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(replacement_cost==null?"null":replacement_cost.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating==null?"null":rating, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(special_features==null?"null":special_features, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_update==null?"null":"" + last_update, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.film_id = null; } else {
      this.film_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.release_year = null; } else {
      this.release_year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.language_id = null; } else {
      this.language_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.original_language_id = null; } else {
      this.original_language_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rental_duration = null; } else {
      this.rental_duration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rental_rate = null; } else {
      this.rental_rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.length = null; } else {
      this.length = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.replacement_cost = null; } else {
      this.replacement_cost = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.rating = null; } else {
      this.rating = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.special_features = null; } else {
      this.special_features = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_update = null; } else {
      this.last_update = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.film_id = null; } else {
      this.film_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.release_year = null; } else {
      this.release_year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.language_id = null; } else {
      this.language_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.original_language_id = null; } else {
      this.original_language_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rental_duration = null; } else {
      this.rental_duration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rental_rate = null; } else {
      this.rental_rate = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.length = null; } else {
      this.length = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.replacement_cost = null; } else {
      this.replacement_cost = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.rating = null; } else {
      this.rating = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.special_features = null; } else {
      this.special_features = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_update = null; } else {
      this.last_update = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    film o = (film) super.clone();
    o.last_update = (o.last_update != null) ? (java.sql.Timestamp) o.last_update.clone() : null;
    return o;
  }

  public void clone0(film o) throws CloneNotSupportedException {
    o.last_update = (o.last_update != null) ? (java.sql.Timestamp) o.last_update.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("film_id", this.film_id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("release_year", this.release_year);
    __sqoop$field_map.put("language_id", this.language_id);
    __sqoop$field_map.put("original_language_id", this.original_language_id);
    __sqoop$field_map.put("rental_duration", this.rental_duration);
    __sqoop$field_map.put("rental_rate", this.rental_rate);
    __sqoop$field_map.put("length", this.length);
    __sqoop$field_map.put("replacement_cost", this.replacement_cost);
    __sqoop$field_map.put("rating", this.rating);
    __sqoop$field_map.put("special_features", this.special_features);
    __sqoop$field_map.put("last_update", this.last_update);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("film_id", this.film_id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("release_year", this.release_year);
    __sqoop$field_map.put("language_id", this.language_id);
    __sqoop$field_map.put("original_language_id", this.original_language_id);
    __sqoop$field_map.put("rental_duration", this.rental_duration);
    __sqoop$field_map.put("rental_rate", this.rental_rate);
    __sqoop$field_map.put("length", this.length);
    __sqoop$field_map.put("replacement_cost", this.replacement_cost);
    __sqoop$field_map.put("rating", this.rating);
    __sqoop$field_map.put("special_features", this.special_features);
    __sqoop$field_map.put("last_update", this.last_update);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}

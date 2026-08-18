package collections;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<StudentDB> student=new ArrayList<>();
        StudentDB studentDB=new StudentDB();
        student=  studentDB.getStudents();
        List<StudentDto> studentDtos = new ArrayList<>();
        studentDtos=student.
                stream().
                map(x->{
                   StudentDto dto=new StudentDto();
                   dto.sid = x.id;
                   dto.sname=x.name;
                   dto.classStudying=x.classStudying;
                   return  dto;
                }).toList();
//        for(StudentDto d : studentDtos){
//            System.out.println(d.sid +" "+d.sname+" "+d.classStudying);
//        }

        Map<String, List<StudentDto>> groupedStudents =
                studentDtos.stream()
                            .collect(Collectors.groupingBy(x -> x.classStudying));

        Gson gson=new Gson();
        String json = gson.toJson(student);
        System.out.println(json);
    }
}

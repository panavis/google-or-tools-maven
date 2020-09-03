/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */


#ifndef SWIGJAVA
#define SWIGJAVA
#endif



#ifdef __cplusplus
/* SwigValueWrapper is described in swig.swg */
template<typename T> class SwigValueWrapper {
  struct SwigMovePointer {
    T *ptr;
    SwigMovePointer(T *p) : ptr(p) { }
    ~SwigMovePointer() { delete ptr; }
    SwigMovePointer& operator=(SwigMovePointer& rhs) { T* oldptr = ptr; ptr = 0; delete oldptr; ptr = rhs.ptr; rhs.ptr = 0; return *this; }
  } pointer;
  SwigValueWrapper& operator=(const SwigValueWrapper<T>& rhs);
  SwigValueWrapper(const SwigValueWrapper<T>& rhs);
public:
  SwigValueWrapper() : pointer(0) { }
  SwigValueWrapper& operator=(const T& t) { SwigMovePointer tmp(new T(t)); pointer = tmp; return *this; }
  operator T&() const { return *pointer.ptr; }
  T *operator&() { return pointer.ptr; }
};

template <typename T> T SwigValueInit() {
  return T();
}
#endif

/* -----------------------------------------------------------------------------
 *  This section contains generic SWIG labels for method/variable
 *  declarations/attributes, and other compiler dependent labels.
 * ----------------------------------------------------------------------------- */

/* template workaround for compilers that cannot correctly implement the C++ standard */
#ifndef SWIGTEMPLATEDISAMBIGUATOR
# if defined(__SUNPRO_CC) && (__SUNPRO_CC <= 0x560)
#  define SWIGTEMPLATEDISAMBIGUATOR template
# elif defined(__HP_aCC)
/* Needed even with `aCC -AA' when `aCC -V' reports HP ANSI C++ B3910B A.03.55 */
/* If we find a maximum version that requires this, the test would be __HP_aCC <= 35500 for A.03.55 */
#  define SWIGTEMPLATEDISAMBIGUATOR template
# else
#  define SWIGTEMPLATEDISAMBIGUATOR
# endif
#endif

/* inline attribute */
#ifndef SWIGINLINE
# if defined(__cplusplus) || (defined(__GNUC__) && !defined(__STRICT_ANSI__))
#   define SWIGINLINE inline
# else
#   define SWIGINLINE
# endif
#endif

/* attribute recognised by some compilers to avoid 'unused' warnings */
#ifndef SWIGUNUSED
# if defined(__GNUC__)
#   if !(defined(__cplusplus)) || (__GNUC__ > 3 || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4))
#     define SWIGUNUSED __attribute__ ((__unused__))
#   else
#     define SWIGUNUSED
#   endif
# elif defined(__ICC)
#   define SWIGUNUSED __attribute__ ((__unused__))
# else
#   define SWIGUNUSED
# endif
#endif

#ifndef SWIG_MSC_UNSUPPRESS_4505
# if defined(_MSC_VER)
#   pragma warning(disable : 4505) /* unreferenced local function has been removed */
# endif
#endif

#ifndef SWIGUNUSEDPARM
# ifdef __cplusplus
#   define SWIGUNUSEDPARM(p)
# else
#   define SWIGUNUSEDPARM(p) p SWIGUNUSED
# endif
#endif

/* internal SWIG method */
#ifndef SWIGINTERN
# define SWIGINTERN static SWIGUNUSED
#endif

/* internal inline SWIG method */
#ifndef SWIGINTERNINLINE
# define SWIGINTERNINLINE SWIGINTERN SWIGINLINE
#endif

/* exporting methods */
#if defined(__GNUC__)
#  if (__GNUC__ >= 4) || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4)
#    ifndef GCC_HASCLASSVISIBILITY
#      define GCC_HASCLASSVISIBILITY
#    endif
#  endif
#endif

#ifndef SWIGEXPORT
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   if defined(STATIC_LINKED)
#     define SWIGEXPORT
#   else
#     define SWIGEXPORT __declspec(dllexport)
#   endif
# else
#   if defined(__GNUC__) && defined(GCC_HASCLASSVISIBILITY)
#     define SWIGEXPORT __attribute__ ((visibility("default")))
#   else
#     define SWIGEXPORT
#   endif
# endif
#endif

/* calling conventions for Windows */
#ifndef SWIGSTDCALL
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   define SWIGSTDCALL __stdcall
# else
#   define SWIGSTDCALL
# endif
#endif

/* Deal with Microsoft's attempt at deprecating C standard runtime functions */
#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_CRT_SECURE_NO_DEPRECATE)
# define _CRT_SECURE_NO_DEPRECATE
#endif

/* Deal with Microsoft's attempt at deprecating methods in the standard C++ library */
#if !defined(SWIG_NO_SCL_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_SCL_SECURE_NO_DEPRECATE)
# define _SCL_SECURE_NO_DEPRECATE
#endif

/* Deal with Apple's deprecated 'AssertMacros.h' from Carbon-framework */
#if defined(__APPLE__) && !defined(__ASSERT_MACROS_DEFINE_VERSIONS_WITHOUT_UNDERSCORES)
# define __ASSERT_MACROS_DEFINE_VERSIONS_WITHOUT_UNDERSCORES 0
#endif

/* Intel's compiler complains if a variable which was never initialised is
 * cast to void, which is a common idiom which we use to indicate that we
 * are aware a variable isn't used.  So we just silence that warning.
 * See: https://github.com/swig/swig/issues/192 for more discussion.
 */
#ifdef __INTEL_COMPILER
# pragma warning disable 592
#endif


/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include <jni.h>
#include <stdlib.h>
#include <string.h>


/* Support for throwing Java exceptions */
typedef enum {
  SWIG_JavaOutOfMemoryError = 1, 
  SWIG_JavaIOException, 
  SWIG_JavaRuntimeException, 
  SWIG_JavaIndexOutOfBoundsException,
  SWIG_JavaArithmeticException,
  SWIG_JavaIllegalArgumentException,
  SWIG_JavaNullPointerException,
  SWIG_JavaDirectorPureVirtual,
  SWIG_JavaUnknownError
} SWIG_JavaExceptionCodes;

typedef struct {
  SWIG_JavaExceptionCodes code;
  const char *java_exception;
} SWIG_JavaExceptions_t;


static void SWIGUNUSED SWIG_JavaThrowException(JNIEnv *jenv, SWIG_JavaExceptionCodes code, const char *msg) {
  jclass excep;
  static const SWIG_JavaExceptions_t java_exceptions[] = {
    { SWIG_JavaOutOfMemoryError, "java/lang/OutOfMemoryError" },
    { SWIG_JavaIOException, "java/io/IOException" },
    { SWIG_JavaRuntimeException, "java/lang/RuntimeException" },
    { SWIG_JavaIndexOutOfBoundsException, "java/lang/IndexOutOfBoundsException" },
    { SWIG_JavaArithmeticException, "java/lang/ArithmeticException" },
    { SWIG_JavaIllegalArgumentException, "java/lang/IllegalArgumentException" },
    { SWIG_JavaNullPointerException, "java/lang/NullPointerException" },
    { SWIG_JavaDirectorPureVirtual, "java/lang/RuntimeException" },
    { SWIG_JavaUnknownError,  "java/lang/UnknownError" },
    { (SWIG_JavaExceptionCodes)0,  "java/lang/UnknownError" }
  };
  const SWIG_JavaExceptions_t *except_ptr = java_exceptions;

  while (except_ptr->code != code && except_ptr->code)
    except_ptr++;

  jenv->ExceptionClear();
  excep = jenv->FindClass(except_ptr->java_exception);
  if (excep)
    jenv->ThrowNew(excep, msg);
}


/* Contract support */

#define SWIG_contract_assert(nullreturn, expr, msg) if (!(expr)) {SWIG_JavaThrowException(jenv, SWIG_JavaIllegalArgumentException, msg); return nullreturn; } else


#include <cstdint>
#include <string>
#include <vector>

#include "ortools/base/basictypes.h"


#include <stdint.h>		// Use the C99 official header


#define SWIGWORDSIZE64
#ifndef LONG_MAX
#include <limits.h>
#endif
#if (__WORDSIZE == 32) || (LONG_MAX == INT_MAX)
# error "SWIG wrapped code invalid in 32 bit architecture, regenerate code using -DSWIGWORDSIZE32"
#endif


#include <string>


#include "ortools/algorithms/knapsack_solver.h"


#ifdef __cplusplus
extern "C" {
#endif

SWIGEXPORT jint JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1KNAPSACK_1BRUTE_1FORCE_1SOLVER_1get(JNIEnv *jenv, jclass jcls) {
  jint jresult = 0 ;
  operations_research::KnapsackSolver::SolverType result;
  
  (void)jenv;
  (void)jcls;
  result = (operations_research::KnapsackSolver::SolverType)operations_research::KnapsackSolver::KNAPSACK_BRUTE_FORCE_SOLVER;
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jint JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1KNAPSACK_164ITEMS_1SOLVER_1get(JNIEnv *jenv, jclass jcls) {
  jint jresult = 0 ;
  operations_research::KnapsackSolver::SolverType result;
  
  (void)jenv;
  (void)jcls;
  result = (operations_research::KnapsackSolver::SolverType)operations_research::KnapsackSolver::KNAPSACK_64ITEMS_SOLVER;
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jint JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1KNAPSACK_1DYNAMIC_1PROGRAMMING_1SOLVER_1get(JNIEnv *jenv, jclass jcls) {
  jint jresult = 0 ;
  operations_research::KnapsackSolver::SolverType result;
  
  (void)jenv;
  (void)jcls;
  result = (operations_research::KnapsackSolver::SolverType)operations_research::KnapsackSolver::KNAPSACK_DYNAMIC_PROGRAMMING_SOLVER;
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jint JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1KNAPSACK_1MULTIDIMENSION_1CBC_1MIP_1SOLVER_1get(JNIEnv *jenv, jclass jcls) {
  jint jresult = 0 ;
  operations_research::KnapsackSolver::SolverType result;
  
  (void)jenv;
  (void)jcls;
  result = (operations_research::KnapsackSolver::SolverType)operations_research::KnapsackSolver::KNAPSACK_MULTIDIMENSION_CBC_MIP_SOLVER;
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jint JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1KNAPSACK_1MULTIDIMENSION_1BRANCH_1AND_1BOUND_1SOLVER_1get(JNIEnv *jenv, jclass jcls) {
  jint jresult = 0 ;
  operations_research::KnapsackSolver::SolverType result;
  
  (void)jenv;
  (void)jcls;
  result = (operations_research::KnapsackSolver::SolverType)operations_research::KnapsackSolver::KNAPSACK_MULTIDIMENSION_BRANCH_AND_BOUND_SOLVER;
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_com_google_ortools_algorithms_mainJNI_new_1KnapsackSolver_1_1SWIG_10(JNIEnv *jenv, jclass jcls, jstring jarg1) {
  jlong jresult = 0 ;
  std::string *arg1 = 0 ;
  operations_research::KnapsackSolver *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  if(!jarg1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null string");
    return 0;
  }
  const char *arg1_pstr = (const char *)jenv->GetStringUTFChars(jarg1, 0); 
  if (!arg1_pstr) return 0;
  std::string arg1_str(arg1_pstr);
  arg1 = &arg1_str;
  jenv->ReleaseStringUTFChars(jarg1, arg1_pstr); 
  result = (operations_research::KnapsackSolver *)new operations_research::KnapsackSolver((std::string const &)*arg1);
  *(operations_research::KnapsackSolver **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_com_google_ortools_algorithms_mainJNI_new_1KnapsackSolver_1_1SWIG_11(JNIEnv *jenv, jclass jcls, jint jarg1, jstring jarg2) {
  jlong jresult = 0 ;
  operations_research::KnapsackSolver::SolverType arg1 ;
  std::string *arg2 = 0 ;
  operations_research::KnapsackSolver *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = (operations_research::KnapsackSolver::SolverType)jarg1; 
  if(!jarg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null string");
    return 0;
  }
  const char *arg2_pstr = (const char *)jenv->GetStringUTFChars(jarg2, 0); 
  if (!arg2_pstr) return 0;
  std::string arg2_str(arg2_pstr);
  arg2 = &arg2_str;
  jenv->ReleaseStringUTFChars(jarg2, arg2_pstr); 
  result = (operations_research::KnapsackSolver *)new operations_research::KnapsackSolver(arg1,(std::string const &)*arg2);
  *(operations_research::KnapsackSolver **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_com_google_ortools_algorithms_mainJNI_delete_1KnapsackSolver(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1init(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlongArray jarg2, jobjectArray jarg3, jlongArray jarg4) {
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  std::vector< int64 > *arg2 = 0 ;
  std::vector< std::vector< int64 > > *arg3 = 0 ;
  std::vector< int64 > *arg4 = 0 ;
  std::vector< std::vector< int64 > > result3 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  
  if(jarg2) {
    arg2 = new std::vector<int64>;
    const int size = jenv->GetArrayLength(jarg2);
    arg2->reserve(size);
    jlong *values = jenv->GetLongArrayElements((jlongArray)jarg2, NULL);
    for (int i = 0; i < size; ++i) {
      arg2->emplace_back(values[i]);
    }
    jenv->ReleaseLongArrayElements((jlongArray)jarg2, values, JNI_ABORT);
  }
  else {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null table");
    return ;
  }
  
  
  if(jarg3) {
    const int size = jenv->GetArrayLength(jarg3);
    result3.clear();
    result3.resize(size);
    for (int index1 = 0; index1 < size; ++index1) {
      jlongArray inner_array =
      (jlongArray)jenv->GetObjectArrayElement(jarg3, index1);
      const int inner_size = jenv->GetArrayLength(inner_array);
      result3[index1].reserve(inner_size);
      jlong * const values =
      jenv->GetLongArrayElements((jlongArray)inner_array, NULL);
      for (int index2 = 0; index2 < inner_size; ++index2) {
        result3[index1].emplace_back(values[index2]);
      }
      jenv->ReleaseLongArrayElements((jlongArray)inner_array, values, JNI_ABORT);
      jenv->DeleteLocalRef(inner_array);
    }
    arg3 = &result3;
  }
  else {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null table");
    return ;
  }
  
  
  if(jarg4) {
    arg4 = new std::vector<int64>;
    const int size = jenv->GetArrayLength(jarg4);
    arg4->reserve(size);
    jlong *values = jenv->GetLongArrayElements((jlongArray)jarg4, NULL);
    for (int i = 0; i < size; ++i) {
      arg4->emplace_back(values[i]);
    }
    jenv->ReleaseLongArrayElements((jlongArray)jarg4, values, JNI_ABORT);
  }
  else {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null table");
    return ;
  }
  
  (arg1)->Init((std::vector< int64 > const &)*arg2,(std::vector< std::vector< int64 > > const &)*arg3,(std::vector< int64 > const &)*arg4);
  {
    delete arg2;
  }
  {
    delete arg4;
  }
}


SWIGEXPORT jlong JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1solve(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  int64 result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  result = (int64)(arg1)->Solve();
  jresult = (jlong)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1bestSolutionContains(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  jboolean jresult = 0 ;
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  int arg2 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  arg2 = (int)jarg2; 
  result = (bool)((operations_research::KnapsackSolver const *)arg1)->BestSolutionContains(arg2);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1isSolutionOptimal(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jboolean jresult = 0 ;
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  result = (bool)((operations_research::KnapsackSolver const *)arg1)->IsSolutionOptimal();
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jstring JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1getName(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jstring jresult = 0 ;
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  result = ((operations_research::KnapsackSolver const *)arg1)->GetName();
  jresult = jenv->NewStringUTF((&result)->c_str()); 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1useReduction(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jboolean jresult = 0 ;
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  result = (bool)((operations_research::KnapsackSolver const *)arg1)->use_reduction();
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1setUseReduction(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jboolean jarg2) {
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  bool arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  arg2 = jarg2 ? true : false; 
  (arg1)->set_use_reduction(arg2);
}


SWIGEXPORT void JNICALL Java_com_google_ortools_algorithms_mainJNI_KnapsackSolver_1setTimeLimit(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jdouble jarg2) {
  operations_research::KnapsackSolver *arg1 = (operations_research::KnapsackSolver *) 0 ;
  double arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(operations_research::KnapsackSolver **)&jarg1; 
  arg2 = (double)jarg2; 
  (arg1)->set_time_limit(arg2);
}


#ifdef __cplusplus
}
#endif

